package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = DatabaseData.JDBC_DRIVER;
	static final String DB_URL = DatabaseData.DB_URL;

	// Database credentials
	static final String USER = DatabaseData.USER;
	static final String PASS = DatabaseData.PASS;

	public static Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			return DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void close(ResultSet rs, Statement stmt, Connection conn){
		try {
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}