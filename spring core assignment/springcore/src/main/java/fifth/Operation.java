package fifth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Operation {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		customerData cus = (customerData) context.getBean("customerData");
		cus.displayData();
	       
	}
}
