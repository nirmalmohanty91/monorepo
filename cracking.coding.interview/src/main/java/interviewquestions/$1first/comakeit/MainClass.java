package interviewquestions.$1first.comakeit;

import java.sql.SQLException;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		SampleDao sampleDao = new SampleDao();
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(001, "xxx", "Maintenance", 2223));
		try {
			sampleDao.merge(list);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
