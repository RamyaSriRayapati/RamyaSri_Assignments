package Employee;

public class Calculatesalary {

	public static void main(String[] args) {
		Labour l1=new Labour(1,"ram" ,20000);
		Labour l2=new Labour(2,"mohan" ,15000);
		Manager m1=new Manager(1,"sai" ,30000);
		Manager m2=new Manager(2,"sri" ,50000);
		System.out.println("Name of Employee:" +l1.getEmployeeName()+  "  and Salary: "+l1.getSalary());
		System.out.println("Name of Employee:" +l2.getEmployeeName()+  "  and Salary: "+l2.getSalary());
		System.out.println("Name of Employee:" +m1.getEmployeeName()+  "  and Salary: "+m1.getSalary());
		System.out.println("Name of Employee:" +m2.getEmployeeName()+  "  and Salary: "+m2.getSalary());
	}

}
