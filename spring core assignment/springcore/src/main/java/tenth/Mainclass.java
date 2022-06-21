package tenth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ten.xml");
		Triangle triangle = (Triangle) context.getBean("triangle-name");
		triangle.draw();
	}

}
