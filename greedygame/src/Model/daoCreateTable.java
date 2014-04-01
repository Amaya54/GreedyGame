package Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class daoCreateTable {

	public void create()
	{
		
		String sql="create table if not exists bookmark (url varchar(100), tags varchar(100));";
		Statement st=null;
		

		Connection con=null;
		ConnectionManager cm=new ConnectionManager();
		con=cm.getConnection();
		 try {
			st=con.createStatement();
			int k=st.executeUpdate(sql);
			System.out.println("Table Created "+k);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	   	  
	}
}
