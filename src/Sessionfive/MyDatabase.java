package sessionFive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDatabase {
	public static void LoadDriver()
	{
		try {
			Class.forName(CONSTANTS.DRIVER_URL);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	
	public static Connection getConnection() 
	{
		try {
			return (Connection) (DriverManager.getConnection(  
			CONSTANTS.DB_URL,CONSTANTS.USER_NAME,CONSTANTS.PASSWORD));
		} catch (SQLException e) {
			System.out.println("Error: "+e.getMessage());
			return null;
		}
		
	}
}
