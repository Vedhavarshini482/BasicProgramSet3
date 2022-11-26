import java.util.Scanner;

class RootValue {
	protected int a, b, c;

	RootValue(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}

class Equation extends RootValue {
	Equation(int a, int b, int c) {
		super(a, b, c);
	}

	public void polynomialEquation() {
		System.out.println("Root1 = " + (-b + Math.sqrt(b * b - 4 * a * c)) / 2
				* a);
		System.out.println("Root2 = " + (-b - Math.sqrt(b * b - 4 * a * c)) / 2
				* a);
	}
}

public class Program15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a,b,c values");
		Equation e = new Equation(s.nextInt(), s.nextInt(), s.nextInt());
		e.polynomialEquation();
	}
}