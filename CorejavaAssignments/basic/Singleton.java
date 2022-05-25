package project;

public class Singleton {
	 private static Singleton singleton;
     
	    private Singleton()
	    {

	    }
	    public static Singleton getInstance()
	    {
	        if(singleton==null)
	        {
	            singleton = new Singleton();
	        }
	        return singleton;
	    }

	    
	    public static void main(String args[])
	    {
	       Singleton singleton= Singleton.getInstance();
	       Singleton singleton1= Singleton.getInstance();

	    }	    

}
