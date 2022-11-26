import java.util.Scanner;

abstract class Factorial {
	abstract void factorial();
}

class Fact extends Factorial {
	public void factorial() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int fact = 1;
		for (int i = n; i >= 1; i--)
			fact = fact * i;
		System.out.println("Fatorial of " + n + " is " + fact);
	}
}

public class Program39 {

	public static void main(String[] args) {
		Fact program = new Fact();
		program.factorial();
	}
}