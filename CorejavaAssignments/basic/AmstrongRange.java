package project;
import java.util.Scanner;

public class AmstrongRange {

	public static void main(String[] args) {
		int n1,n2,i;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number");
		n1=sc.nextInt();
		System.out.println("Enter second number");
		n2=sc.nextInt();
		for(i=n1;i<n2;i++) {
			int r,num,sum=0;
			num=i;
			while(num>0)
			{
				r=num%10;
				sum =sum+(r*r*r);
				num=num/10;
			}
			if(sum==i)
			{
				System.out.println(""+i+"is a armstrong number");
			}

		}}}
