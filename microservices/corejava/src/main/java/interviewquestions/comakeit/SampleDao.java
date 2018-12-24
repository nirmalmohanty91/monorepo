package interviewquestions.comakeit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SampleDao {

	public Connection databaseConnection() throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1", "scott", "nirmal");
		return conn;
	}

	public static void merge(ArrayList<Employee> emp) throws SQLException, ClassNotFoundException {
		Connection conn = new SampleDao().databaseConnection();
		PreparedStatement ps = conn.prepareStatement("Select * from Employee");
		ResultSet rs = ps.executeQuery();
		// System.out.println(emp.get(0));
		int rsmd = rs.getMetaData().getColumnCount();
		// System.out.println(rsmd);
		ArrayList<Employee> emp1 = new ArrayList<Employee>();
		// System.out.println(rs);
		while (rs.next()) {
			// System.out.println("---");
			emp1.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
		}
		// System.out.println(emp.size() + " " + emp1.size());

		for (int i = 0; i < emp.size(); i++) {
			boolean isInsert = false;
			boolean isUpdate = false;
			boolean isDelete = false;
			for (int j = 0; j < emp1.size(); j++) {
				System.out.println(j + ": " + emp.get(i).getEmpCode() + " " + emp1.get(j).getEmpCode());
				if (emp.get(i).getEmpCode() == emp1.get(j).getEmpCode() && emp.get(i).getEmpName().equalsIgnoreCase(emp1.get(j).getEmpName())) {
					isUpdate = true;

				} else {
					System.out.println("Going to insert");

					isInsert = true;

				}
				System.out.println("insert " + isInsert + " " + isUpdate);

			}

			if (isUpdate) {
				System.out.println("Record Found in database");
				System.out.println("Going to update....");
				PreparedStatement update = conn.prepareStatement("update EMPLOYEE set DEPARTMENT_NAME=?,PHONE_NUMBER=? where EMPLOYEE_CODE=?");
				update.setString(1, emp.get(i).getDeptName());
				update.setInt(2, emp.get(i).getPhoneNumber());
				update.setInt(3, emp.get(i).getEmpCode());
				int rs1 = update.executeUpdate();
				System.out.println(rs1);
				if (rs1 > 0)
					System.out.println("Record got Updated");
				else
					System.out.println("Not updated");

			} else if (isInsert) {

				PreparedStatement insert = conn.prepareStatement("insert into Employee values(?,?,?,?)");
				insert.setInt(1, emp.get(i).getEmpCode());
				insert.setString(2, emp.get(i).getEmpName());
				insert.setString(3, emp.get(i).getDeptName());
				insert.setInt(4, emp.get(i).getPhoneNumber());
				int rs1 = insert.executeUpdate();
				System.out.println(rs1);
				if (rs1 > 0)
					System.out.println("Record inserted");
				else
					System.out.println("Not inserted");
			}
		}

	}
}
