import java.util.Scanner;

abstract class PrimeNum {

	final void primeNumber() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		int num = 0;
		for (int i = 1; i < a; i++) {
			if (i != 1 && a % i == 0)
				num++;
		}
		if (num == 0)
			System.out.println(a + " is a prime number");
		else
			System.out.println(a + " is not a prime number");
	}
}

public class Program49 extends PrimeNum {

	public static void main(String[] args) {
		Program49 program = new Program49();
		program.primeNumber();
	}
}