package Banks;

public class Savingsaccount extends Bank {
	long fixeddeposit=300000;
	double rateofinterest=0.2;
	public Savingsaccount( String AccountholderName, double totalcash) {
		super(AccountholderName, totalcash);
	}
	public double gettotalcash() {
		return totalcash+( fixeddeposit*rateofinterest);
	}

}
