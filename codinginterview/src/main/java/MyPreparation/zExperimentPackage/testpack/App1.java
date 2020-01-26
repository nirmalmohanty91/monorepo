package MyPreparation.zExperimentPackage.testpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App1 {

	public static void main(String[] args) throws SQLException {
		// Class.forName("oracle.jdbc.driver.OracleDriver");
		/*
		 * oracle.jdbc.driver.OracleDriver driver = new
		 * oracle.jdbc.driver.OracleDriver();
		 * DriverManager.registerDriver(driver);
		 */

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "nirmal");
		Statement stm = conn.createStatement();
		String sql = "select ename from emp";
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getString("ename"));
		}
		rs.close();
		conn.close();
		System.out.println("Connection estabilsed");

	}
}
