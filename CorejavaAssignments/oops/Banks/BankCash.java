package Banks;

public class BankCash {
public static void main(String[] args) {
	double Tcash;
	Savingsaccount sa=new Savingsaccount("mohan", 200000);
	sa.gettotalcash();
	Currentaccount ca=new Currentaccount("kavya",80000);
	ca.gettotalcash();
	Tcash=sa.gettotalcash()+ca.gettotalcash();
	System.out.println("Name of Accountholder:" +sa.getAccountholderName()+  "  and totalcash: "+sa.gettotalcash());
	System.out.println("Name of Accountholder:" +ca.getAccountholderName()+  "  and totalcash: "+ca.gettotalcash());
	System.out.println("total cash in bank:" +Tcash);
}
}
