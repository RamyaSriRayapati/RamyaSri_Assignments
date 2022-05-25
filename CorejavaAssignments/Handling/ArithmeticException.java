package Handling;

import java.util.Scanner;

public class ArithmeticException {
	public static void main(String[] args) {
		
		int a,b,result;
		
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=sa.nextInt();
		System.out.println("Enter the value of b");
		b=sa.nextInt();
		try {
		result=a/b;
			System.out.println("result is given:" +result);
		}
		catch(java.lang.ArithmeticException ex)
		{
			System.out.println("error:"+ex.getMessage());
		}
	}
}
