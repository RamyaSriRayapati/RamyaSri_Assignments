package project;

import java.util.Scanner;

public class Incometax {

	public static void main(String[] args) {
	long i;
	double t;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Income");
	i=sc.nextLong();
	if(i>=0&&i<=180000) {
		t=0;
		System.out.println("tax amount:"+t);
		
	}
	else if (i>=181001&&i<=300000) {
		t=i*0.1;
		System.out.println("tax amount:"+t);
	}
	else if (i>=300001&&i<=500000) {
		t=i*0.2;
		System.out.println("tax amount:"+t);
	}
	else if (i>=500001&&i<=1000000) {
		t=i*0.3;
		System.out.println("tax amount:"+t);
	}
	}}
	


