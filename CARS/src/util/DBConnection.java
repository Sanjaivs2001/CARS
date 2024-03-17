package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
private DBConnection() {	}
	
	public static Connection createConnection()
	{
		Connection con = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cars?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC","root","#Future2001");
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
		return con;
	}
}
