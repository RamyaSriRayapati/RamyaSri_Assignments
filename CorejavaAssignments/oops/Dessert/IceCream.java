package Dessert;

public class IceCream extends DessertItem {
	 protected int cost;

	  public IceCream(String n, int ct){
	    super(n);
	    cost = ct;
	  }

	  public int getCost(){
	    return  cost;
	  }

}
