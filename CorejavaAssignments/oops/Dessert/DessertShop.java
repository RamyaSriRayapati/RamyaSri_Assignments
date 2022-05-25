package Dessert;

public class DessertShop {
	public final static double TAX_RATE = 6.5;      
	  public final static int MAX_ITEM_NAME_SIZE = 25;
	  public final static int COST_WIDTH = 6;

	  public static String dollars2rupeesAndollars(int dollars) {
	    String s = "";


	    int rupees = dollars/60;
	    dollars = dollars % 100;

	    if (rupees > 0)
	      s += dollars;

	    s +=".";

	    if (rupees < 10)
	      s += "0";

	    s += rupees;
	    return s;
	  }

	  public static String euro2rupeesAndeuro(int euro) {
		    String s = "";


		    int rupees = euro/70;
		    euro = euro% 100;

		    if (rupees > 0)
		      s += euro;

		    s +=".";

		    if (rupees < 10)
		      s += "0";

		    s += rupees;
		    return s;
		  }
}
