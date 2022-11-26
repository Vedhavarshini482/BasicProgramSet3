import java.util.Scanner;

interface Solution {
	
	void remainder();

	void quotient();
}

class Soln implements Solution {
	
	public void remainder() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two values");
		int a = s.nextInt(), b = s.nextInt();
		System.out.println("a % b = " + (a % b));
	}

	public void quotient() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two values");
		int a = s.nextInt(), b = s.nextInt();
		System.out.println("a / b = " + (a / b));
	}
}

public class Program29 {

	public static void main(String[] args) {
		Soln program = new Soln();
		program.quotient();
		program.remainder();
	}
}