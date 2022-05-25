package Info;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@ interface TestAnnotation{
	
public @interface Testinfo {
	public String Developer();

	public String DeveloperID();

	public String Supervisior();

	public String Date();

	public String Time();

	public String Description();
	}


public class Info1
{
	@Testinfo(Developer="Ramya", DeveloperID="07635",Supervisior="sunny",Date="25/02/2022",Time="05:40pm",Description="i am happy")
	void fun1()
	{
		System.out.println("Test method 1");
	}

	@Testinfo(Developer="sri", DeveloperID="17635",Supervisior="suresh",Date="23/02/2022",Time="07:40pm",Description="i am soo happy")
	void fun2()
	{
		System.out.println("Test method 2");
	}
	public static void main(String args[])
	{
		System.out.println("Hello");
	}
}
}

