package helpers;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {

	public static Connection getConnection() throws Exception{
		
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee","root","root123");
		return conn;
		// TODO Auto-generated constructor stub
	}

}
