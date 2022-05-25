package Employee;

public class Labour extends Employee{
	int overtime=2;
	public Labour(int employeeId, String employeeName, double salary) {
		super(employeeId, employeeName, salary);        
	}

	public double getSalary() {

		return salary+salary*overtime;
	}


}
