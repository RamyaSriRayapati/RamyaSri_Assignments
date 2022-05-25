package Stream;

public class Trader {
	 String tname;
	  String city; 
	    

	 public Trader(String tname,String city)
	{
	    this. tname= tname;
	    this. city=city; 
	      
	}
	 public String gettname() {
	        return tname;
	    }
	    public void settname(String tname) {
	        this.tname = tname;
	    }
	    public String getcity() {
	        return city;
	    }
	    public void setcity(String city) {
	        this.city = city;
	    }

	    
	    public String toString() {
	        return "Trader [name=" + tname + ", city=" + city + "]";
	    }

}
