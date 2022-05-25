package Banks;

public class Bank {
	
	String name;
	double totalcash;
	public Bank( String AccountholderName, double totalcash) {
		super();
		this.name = AccountholderName;
		this.totalcash = totalcash;
	}

	public String getAccountholderName() {
		return name;
	}
	public void setAccountholderName(String AccountholderName) {
		this.name = AccountholderName;
	}
	public double gettotalcash() {
		return totalcash;
	}
	public void settotalcash(double totalcash) {
		this.totalcash = totalcash;
	}
}
