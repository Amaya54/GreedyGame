package Model;

import java.sql.*;

public class daoSetData {
	public beanSetData insert(beanSetData bean)
	{
		ConnectionManager cm=new ConnectionManager();
		Connection con=null;
		PreparedStatement st=null;
		String sql="insert into bookmark values (?,?);";
		con=cm.getConnection();
		try {
			st=con.prepareStatement(sql);
			st.setString(1, bean.getBookmark());
			st.setString(2, bean.getTag());
			boolean k=st.execute();
			if(!k)
				bean.setValid(true);
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return bean;
	}

}
