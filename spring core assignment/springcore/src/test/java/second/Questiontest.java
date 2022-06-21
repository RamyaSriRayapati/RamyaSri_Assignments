package second;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Questiontest {

	ApplicationContext quizContext= new ClassPathXmlApplicationContext("quiz.xml");
    Question ques1 = (Question) quizContext.getBean("Question1");
    @Test
    void getQuestionId() {
        assertEquals(1,ques1.getQuestionId());
    }

    @Test
    void getQuestion() {
        assertEquals("What is inheritance?",ques1.getQuestion());
    }

}
