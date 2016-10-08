package tel_ran.databases.jdbs.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tel_ran.databases.jdbs.DatabaseConnection;

public class DatabaseConnectionTest {

	@Test
	public void testConnection() throws Exception {
		DatabaseConnection databaseConnection = DatabaseConnection.getDatebaseConnection
				("root", "12345", null, null);
		DatabaseConnection databaseConnection2 = DatabaseConnection.getDatebaseConnection
				("root", "12345", null, null);
		assertTrue(databaseConnection == databaseConnection2);
		assertTrue(databaseConnection.getConnection() != null);
	}

}
