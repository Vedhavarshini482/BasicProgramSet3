import java.util.Scanner;

abstract class Fac {

	abstract int number();

	abstract int fact(int num);
}

public class Program100 extends Fac {

	public static void main(String[] args) {
		Program100 program = new Program100();
		int i = program.number();
		System.out.println("Factorial of " + i + " is " + program.fact(i));
	}

	public int number() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		return n;
	}

	public int fact(int num) {
		if (num >= 1)
			return num *= fact(num - 1);
		else
			return 1;
	}
}