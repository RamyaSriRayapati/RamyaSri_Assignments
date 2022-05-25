package project;

import java.util.Scanner;

public class Validation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String username="Ramya";
		String  password ="123";
		String usename,pwd;
		int i=1;
		while(i>0) {
			System.out.println("Username:");
			usename=sc.next();
			System.out.println("Password:");
			pwd=sc.next();
			if(username.equals(usename)&&password.equals(pwd)) {
				System.out.println("Welcome "+usename);
				break;
			}
			else
			{
				System.out.println("Username and Password are wrong.");
				i++;
			}
			if(i>3) {
				System.out.println("Contact Admin");
				break;
			}
		}
	}
}
