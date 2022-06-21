package Eight;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Operation {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Eight.xml");
		context.registerShutdownHook();
		Customer cus = (Customer) context.getBean("customer");
		cus.displayData();
	}
}
