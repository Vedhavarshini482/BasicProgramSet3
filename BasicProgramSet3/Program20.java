import java.util.Scanner;

class PostandPrefix {

	void postfixANDprefix() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two values");
		int a = s.nextInt(), b = s.nextInt();
		System.out.println("a++ - ++a = " + (a++ - ++a));
		System.out.println("b-- - --b = " + (b-- - --b));
	}
}

public class Program20 extends PostandPrefix {

	public static void main(String[] args) {
		Program20 program = new Program20();
		program.postfixANDprefix();
	}
}