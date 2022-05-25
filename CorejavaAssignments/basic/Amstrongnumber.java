package project;

import java.util.Scanner;

public class Amstrongnumber {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		int temp=n;
		int r,sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
		}
		if(temp==sum)
			System.out.println("It is a armstrong number");
		else
		{
			System.out.println("It is not a amstrong number");
		}
	}}

