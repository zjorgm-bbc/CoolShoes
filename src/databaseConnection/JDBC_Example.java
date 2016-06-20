package databaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Example {

	public static void main(String[] args) {
		Connection connection = DatabaseConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			String sql = "select * from Kunde;";
			rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				String name = rs.getString("KName");
				String vorname = rs.getString("KVorname");
				String adresse = rs.getString("KAdresse");
				int plz = rs.getInt("KPLZ");

				// Display values
				System.out.print("Name: " + name);
				System.out.print(", Vorname: " + vorname);
				System.out.print(", Adresse: " + adresse);
				System.out.println(", PLZ: " + plz);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} // end try
		finally {
			DatabaseConnection.close(rs, stmt, connection);
		}
		System.out.println("Goodbye!");
	}// end main
}// end FirstExample