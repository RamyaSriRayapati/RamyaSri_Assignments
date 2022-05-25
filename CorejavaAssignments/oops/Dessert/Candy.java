package Dessert;

public class Candy extends DessertItem {
	 protected double weight;
	  protected double pricePerPound;

	  public Candy(String n, double ppp, int w){
	    super(n);
	    pricePerPound = ppp;
	    weight = w;
	  }

	  public int getCost(){
	    return  (int)Math.round(weight * pricePerPound);
	  }

}
