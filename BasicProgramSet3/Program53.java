import java.util.Scanner;

class Calculator {

	public void calculator() {
		Scanner s = new Scanner(System.in);
		System.out
				.println("Enter\n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division\n5 for Modulo Division");
		char ch = s.next().charAt(0);
		System.out.println("Enter two Numbers");
		int a = s.nextInt(), b = s.nextInt();
		switch (ch) {
		case '1':
			System.out.println("a+b = " + (a + b));
			break;
		case '2':
			System.out.println("a-b = " + (a - b));
			break;
		case '3':
			System.out.println("a*b = " + (a * b));
			break;
		case '4':
			System.out.println("a/b = " + (a / b));
			break;
		case '5':
			System.out.println("a%b = " + (a % b));
			break;
		}
	}
}

public class Program53 extends Calculator {

	public static void main(String[] args) {
		Program53 program = new Program53();
		program.calculator();
	}
}