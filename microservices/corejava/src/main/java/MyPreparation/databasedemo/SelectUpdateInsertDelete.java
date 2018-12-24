package MyPreparation.databasedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectUpdateInsertDelete {

	public static void main(String[] args) {

		// Class.forName("oracle.jdbc.driver.OracleDriver");

		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1", "scott", "nirmal");
			PreparedStatement ps1 = conn.prepareStatement("Select name from friends");
			PreparedStatement ps2 = conn.prepareStatement("insert into friends values(?,?,?)");
			ps2.setString(1, "Chandler");
			ps2.setInt(2, 30);
			ps2.setInt(3, 34000);
			ResultSet rs2 = ps2.executeQuery();
			ResultSet rs = ps1.executeQuery();
			while (rs.next()) {
				String name = rs.getString(1);
				System.out.println(name);
			}

			ps1.close();
			ps2.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
