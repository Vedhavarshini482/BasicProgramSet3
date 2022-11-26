import java.util.Scanner;

class Ternary {
	int a, b;

	Ternary(int a, int b) {
		this.a = a;
		this.b = b;
	}

	protected void ternaryOperator() {
		System.out.println(a > b ? ("a is greater than b")
				: ("a is less than b"));
	}
}

public class Program18 {

	public static void main(String[] args) {
		Program18 program = new Program18();
		program.operator();
	}

	void operator() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a and b value");
		Ternary t = new Ternary(s.nextInt(), s.nextInt());
		t.ternaryOperator();
	}
}