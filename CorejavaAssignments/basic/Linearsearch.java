package project;

import java.util.Scanner;

public class Linearsearch {
	public static void main(String[] args) {
		int value,i;
		int []a=new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int size=a.length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		value=sc.nextInt();
		for(i=0;i<size-1;i++) {
			if(a[i]==value) {
				System.out.println("value found at index "  +i);
			}	
		}	
	}
}
