package interviewquestions.comakeit;

public class FromDB {
	private int empCode;
	private String empName;
	private String deptName;
	private int phoneNumber;

	public FromDB(int empCode, String empName, String deptName, int phoneNumber) {
		this.empCode = empCode;
		this.empName = empName;
		this.deptName = deptName;
		this.phoneNumber = phoneNumber;

	}

	public int getEmpCode() {
		return empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public String getDeptName() {
		return deptName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

}
