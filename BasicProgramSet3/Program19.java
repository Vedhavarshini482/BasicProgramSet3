import java.util.Scanner;

class Bitwise {

	void bitwiseOperator() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two values");
		int a = s.nextInt(), b = s.nextInt();
		System.out.println(" a|b = " + (a | b));
		System.out.println(" a&b = " + (a & b));
		System.out.println(" ~a  = " + (~a));
		System.out.println(" ~b  = " + (~b));
		System.out.println(" a^b = " + (a ^ b));
		System.out.println("a^~b = " + (a ^ ~b));
		System.out.println("~a^b = " + (~a ^ b));
		System.out.println("a>>b = " + (a >> b));
		System.out.println("b>>a = " + (b << a));
	}
}

public class Program19 {

	public static void main(String[] args) {
		Bitwise program = new Bitwise();
		program.bitwiseOperator();
	}
}