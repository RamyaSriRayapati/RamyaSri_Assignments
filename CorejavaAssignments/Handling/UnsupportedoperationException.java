package Handling;

import java.util.Scanner;

public class UnsupportedoperationException   {
		public static void main(String[] args){
			
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
			catch(java.lang.UnsupportedOperationException t) {
			        
				System.out.println("Message:"+t.getMessage());
			
			}
		}
}

