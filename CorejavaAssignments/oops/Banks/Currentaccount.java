package Banks;

public class Currentaccount extends Bank {
	long  cashcredit=200000;
	public Currentaccount( String AccountholderName, double totalcash) {
		super(AccountholderName, totalcash);
	}
	public double gettotalcash() {
		return totalcash+cashcredit;
	}

}
