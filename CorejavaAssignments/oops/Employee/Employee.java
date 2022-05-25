package Employee;


public class Employee {
	int empid;
	String name;
	double salary;
	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.empid = employeeId;
		this.name = employeeName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return empid;
	}
	public void setEmployeeId(int employeeId) {
		this.empid = employeeId;
	}
	public String getEmployeeName() {
		return name;
	}
	public void setEmployeeName(String employeeName) {
		this.name = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

