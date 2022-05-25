package Dessert;

public class Cookie extends DessertItem {
	protected double number;
	  protected double pricePerDozen;

	  public Cookie(String n, double ppd, int nb){
	    super(n);
	    pricePerDozen = ppd;
	    number = nb;
	  }

	  public int getCost(){
	    return  (int)Math.round(number / 12 * pricePerDozen);
	  }

}
