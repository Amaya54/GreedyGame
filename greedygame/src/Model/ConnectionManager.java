package Model;


	
	import java.sql.*;


	public class ConnectionManager {
		   Connection con;		         
		   public  Connection getConnection()
		   {		    
		      try
		      {		      
		         Class.forName("com.mysql.jdbc.Driver");		         
		         try
		         {            	
		            con = DriverManager.getConnection( "jdbc:mysql://localhost/<DATABASE NAME>", "<USERNAME>", "<PASSWORD>");
		         }		        
		         catch (SQLException ex)
		         {
		            ex.printStackTrace();
		         }
		      }
		      catch(ClassNotFoundException e)
		      {
		         System.out.println(e);
		      }
		   return con;
		}      
	  }


