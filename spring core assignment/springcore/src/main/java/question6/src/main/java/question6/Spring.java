package question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {

	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(context.getMessage("url",null,"Default Driver",null));
		System.out.println(context.getMessage("username",null,"Default Driver",null));
		System.out.println(context.getMessage("password",null,"Default Driver",null));
	}

	}


