package Dessert;

public class Order {
	protected int size;
	  protected DessertItem[] dessertItems;
	  protected int amount;
	  protected int sum;
	  protected final double taxRate;

	  Order(){
	    size = 100;
	    dessertItems = new DessertItem[size];
	    amount = 0;
	    sum = 0;
	    taxRate = DessertShop.TAX_RATE;
	  }

	  public void enterItem(DessertItem d){
	    dessertItems[amount] = d;
	    amount ++;
	  }

	  public int numberOfItems(){
	    return amount;
	  }

	  public int totalCost(){
	    sum = 0;
	    for(int i = 0; i < amount; i ++){
	      sum += dessertItems[i].getCost();
	    }
	    return sum;
	  }

	  public int totalTax(){
	    return (int)(Math.round(this.totalCost() * taxRate / 100));
	  }

	  public void clear(){
	    for(DessertItem d : dessertItems){
	      d = null;
	    }
	    amount = 0;
	    sum = 0;
	  }
	  public String toString(){
	    String result = "Thank You! \n";
      result += "Purchased: \n" ;

	    String totalPay = DessertShop.dollars2rupeesAndollars( totalCost()+totalTax());
	    String totalPay1 = DessertShop.euro2rupeesAndeuro( totalCost()+totalTax() );
	    if(totalPay.length() > DessertShop.COST_WIDTH){
	      totalPay = totalPay.substring(0, DessertShop.COST_WIDTH);
	      
	    }
	   
	    
	    else if(totalPay1.length() > DessertShop.COST_WIDTH){
		      totalPay1 = totalPay1.substring(0, DessertShop.COST_WIDTH);
	   
}
	    result += "$" + totalPay ;
	    result+=     "  €"+totalPay1;
	    return result;
	  }
}
