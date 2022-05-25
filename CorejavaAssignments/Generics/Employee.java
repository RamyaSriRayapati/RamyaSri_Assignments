package Generics;

import java.util.HashSet;

public class Employee {
	private int empid;
	private String empname;
	private int salary;
	private String department;
	public Employee(int empid, String empname, int salary , String department) {
		super();
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		this.department=department;
	}
	public final int getEmpid() {
		return empid;
	}
	
	
	public final void  setEmpid(int empid) {
		this.empid=empid;
	}
	
	public final String getempname(){
		return empname;
	}
	public final void Setempname(String empname){
		this.empname=empname;
	}
	public final int getsalary() {
		return salary;
	}
	public final void  setsalary(int salary) {
		this.salary=salary;
	}
	public final String getdepartment() {
		return department;
	}
	public final void Setdepartment(String department) {
		this.department=department;
	}
	public String toString() {
		return "Employee[empid:" +empid+ ",empname:"+empname+ ",salary:" +salary+  ",department:"+department+"]";
		
	}
	
	public int hashCode() {
		return this.empid;
	}
	
	public boolean equals(Object obj) {
		Employee employee=(Employee) obj;
		if(employee.empid==this.empid) {
			employee.Setempname(this.empname);
			employee.setsalary(this.salary);
			employee.Setdepartment(this.department);
			
		}
		return true;
	}
	
	
	public static void main(String[] args) {
	HashSet<Employee>emp=new HashSet<>();
	emp.add(new Employee(1,"Ramya",500000,"cse"));
	
	emp.add(new Employee(2,"mohana",700000,"ece"));
	System.out.println("emplyees:" +emp);
	}

}
