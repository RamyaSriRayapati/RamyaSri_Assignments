package second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Quizmain {
	 public static void main(String[] args) {
	        ApplicationContext quizContext= new ClassPathXmlApplicationContext("quiz.xml");
	        Question ques1 = (Question) quizContext.getBean("Question1");
	        //Question ques2 = (Question) quizContext.getBean("Question2");
	        //Question ques3 = (Question) quizContext.getBean("Question3");
	        System.out.println(ques1);
	        //System.out.println(ques2);
	        //System.out.println(ques3);
	    }
}
