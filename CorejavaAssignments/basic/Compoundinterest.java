package project;

import java.util.Scanner;

public class Compoundinterest {

	public static void main(String[] args) {
		double p,t,n,r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount");
		p=sc.nextDouble();
		System.out.println("Enter time ");
		t=sc.nextDouble();
		System.out.println("Enter number of times that interest is compounded per unit t");
		n=sc.nextDouble();
		System.out.println("Enter annual interest rate");
		r=sc.nextDouble();
         c=p*Math.pow(1+(r/n),(n*t))-p;
         System.out.println("compund interest is :" +c);
	}

}
