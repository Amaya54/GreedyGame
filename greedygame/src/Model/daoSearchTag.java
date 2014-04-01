package Model;
import java.sql.*;
import java.util.ArrayList;
public class daoSearchTag {
	public beanSearchTag search(beanSearchTag bean)
	{
		String sql="select url from bookmark where tags like '%"+bean.getTag()+"%'";
		PreparedStatement ps=null;
		ResultSet rs=null;
		Connection con=null;
		ConnectionManager cm=new ConnectionManager();
		con=cm.getConnection();
		ArrayList<String> bookmark=new ArrayList<String>();
		try {
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			bean.setValid(false);
			while(rs.next())
			{
				bookmark.add(rs.getString(1)+"<br>");
			    bean.setValid(true);	
			}  
		    bean.setBookmark(bookmark);
		  
		} 
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return bean;
	}

}
