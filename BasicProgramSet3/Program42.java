import java.util.Scanner;

abstract class Gcd {
	abstract void gcd();
}

public class Program42 extends Gcd {

	public static void main(String[] args) {
		Program42 program = new Program42();
		program.gcd();
	}

	public void gcd() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = s.nextInt(), b = s.nextInt(), gcd = 1;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0)
				gcd = i;
		}
		System.out.println("GCD of " + a + " and " + b + " is " + gcd);
	}
}