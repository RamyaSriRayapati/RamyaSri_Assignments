package Abstracts;
//*3. When we extend an abstract class, we must either override all the
//abstract methods in sub class 
//or declare subclass as abstract
public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("Eat biscuits");
		
	}
	

}
