package StringBuffer;

public class InserttextStringBuffer {
public static void main(String[] args) {
	StringBuffer b = new StringBuffer("It is used to_;");
    b.insert(14,"insert text");
    System.out.println(b);
}
}
