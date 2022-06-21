package third;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankController {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		BankAccountServiceImpl bA = (BankAccountServiceImpl) context.getBean("bankAccountService");
		System.out.println(bA.withdraw(123, 5));
		System.out.println(bA.deposit(124, 10));
		System.out.println(bA.fundTransfer(123, 125, 10));
		System.out.println(bA.getBalance(123));
	}

}


