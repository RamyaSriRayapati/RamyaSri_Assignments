package Lambda;
import java.util.Scanner;

public class Cal {
	public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Add two numbers to the calculator: ");
        double a= s.nextDouble();
        double b= s.nextDouble();
        System.out.println("Your Choices 1)Add 2)Subtract 3)Multiply 4)Divide: ");
        int choice= s.nextInt();
        switch (choice){
            case 1:
                calculator add = (x,y) -> System.out.println(x+y);
                add.foo(a,b);
                break;
            case 2:
                calculator sub= (x,y) -> System.out.println(x-y);
                sub.foo(a,b);
                break;
            case 3:
                calculator mul=(x,y) -> System.out.println(x*y);
                mul.foo(a,b);
                break;
            case 4:
                calculator div=(x,y) -> System.out.println(x/y);
                div.foo(a,b);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
interface calculator{
    void foo(double a, double b);
}


