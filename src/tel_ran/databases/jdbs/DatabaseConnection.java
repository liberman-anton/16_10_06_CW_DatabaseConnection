package tel_ran.databases.jdbs;

import java.sql.*;

public class DatabaseConnection {
	private static final String DEFAULT_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DEFAULT_URL = "jdbc:mysql://localhost/test";
	private static DatabaseConnection databaseConnection;
	private Connection connection;
	
	public Connection getConnection() {
		return connection;
	}

	private DatabaseConnection(String username, String password, String url, String driver) throws Exception{
		if(driver == null)
			driver = DEFAULT_DRIVER;
		if(url == null)
			url = DEFAULT_URL;
		Class.forName(driver);
		connection = DriverManager.getConnection(url,username,password);
	}
	
	synchronized public static DatabaseConnection getDatebaseConnection(String username, String password, String url, String driver) throws Exception{
		if(databaseConnection == null)
			databaseConnection = new DatabaseConnection(username, password, url, driver);
		return databaseConnection;
	}
}
