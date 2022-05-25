package project;

import java.util.Scanner;

public class Totalavgsum {
	public static void main(String[] args) {
		int A1,B1,C1,A2,B2,C2,A3,B3,C3,totalsum1,totalsum2,totalsum3,sumA,sumB,sumC;
		double totalavg1,totalavg2,totalavg3,avgA,avgB,avgC;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first student marks");
		
		System.out.println("Enter subject A marks");
		A1=sc.nextInt();
		
		System.out.println("Enter subject B marks");
		B1=sc.nextInt();
		
		System.out.println("Enter subject C marks");
		C1=sc.nextInt();
		
		System.out.println("Enter second student marks");
		System.out.println("Enter subject A marks");
		A2=sc.nextInt();
		
		System.out.println("Enter subject B marks");
		B2=sc.nextInt();
		
		System.out.println("Enter subject C marks");
		
		C2=sc.nextInt();
		
		System.out.println("Enter third student marks");
		
		System.out.println("Enter subject A marks");
		A3=sc.nextInt();
		
		System.out.println("Enter subject B marks");
		B3=sc.nextInt();
		
		System.out.println("Enter subject C marks");
		C3=sc.nextInt();
		
		totalsum1=A1+B1+C1;
		totalsum2=A2+B2+C2;
		totalsum3=A3+B3+C3;
		
		totalavg1=totalsum1/3;
		totalavg2=totalsum2/3;
		totalavg3=totalsum3/3;
		
		sumA=A1+A2+A3;
		sumB=B1+B2+B3;
		sumC=C1+C2+C3;
		
		avgA=sumA/3;
		avgB=sumB/3;
		avgC=sumC/3;
		System.out.println("first student total:" +totalsum1+   "and average is:" +totalavg1 );
		System.out.println("second student total:" +totalsum2+   "and average is:" +totalavg2 );
		System.out.println("third student total:" +totalsum3+    "and average is:" +totalavg3 );
		
		System.out.println("subjectA total:" +sumA+  "and average is:" +avgA );
		System.out.println("subjectB total:" +sumB+  "and average is:" +avgB );
		System.out.println("subjectC total:" +sumC+  "and average is:" +avgC );
	}
}

