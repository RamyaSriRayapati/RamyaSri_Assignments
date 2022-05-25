package project;
import java.util.Scanner;
public class Simpleinterest {

	public static void main(String[] args) {
		double  p,t,r,s;
		 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principal amount");
		p=sc.nextDouble();
		System.out.println("Enter  time ");
		t=sc.nextDouble();
		System.out.println("Enter rate per annum");
	    r=sc.nextDouble();
		s=(p*t*r)/100;
		System.out.println("simple interest:" +s);

	}

}
