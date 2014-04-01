package Model;
import java.sql.*;
import java.util.ArrayList;
public class daoSearchAllTag {
	public beanSearchAllTag search(beanSearchAllTag bean)
	{
		String sql="select tags,url from bookmark";
		PreparedStatement ps=null;
		ResultSet rs=null;
		Connection con=null;
		ConnectionManager cm=new ConnectionManager();
		con=cm.getConnection();
		ArrayList<String> tags=new ArrayList<String>();
		ArrayList<String> url=new ArrayList<String>();
		try {
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				tags.add(rs.getString(1));
				url.add(rs.getString(2)+"<br>");
			}  
		    bean.setTags(tags);
		    bean.setUrl(url);
		} 
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return bean;
	}

}
