package Handling;

import java.util.Scanner;

public class SavingsaccountException {
	public static double withdraw(double balance)

	{
		double amountwd;
		Scanner se=new Scanner(System.in);
		System.out.println("Enter the amount");
		amountwd=se.nextDouble(); 
		if(amountwd>balance) {
			throw new IllegalArgumentException("Insufficient balance amount");
		}
		if(balance==0) {

			throw new IllegalArgumentException("Insufficient balance amount"); 
		}
		if(amountwd<0) {
			throw new IllegalArgumentException("Illegal Bank Transaction"); 
		}	 

		return balance;
	}
	public static double deposit() {
		double amountdp = 0;
		return amountdp;
	}
	public static void main(String[] args) {
		long id;
		double balance;
		Scanner se=new Scanner(System.in);
		System.out.println("Enter the account id");
		id= se.nextLong();
		System.out.println("Enter the balance amount");
		balance=se.nextDouble();
		deposit();
		withdraw(balance);

	}
}

