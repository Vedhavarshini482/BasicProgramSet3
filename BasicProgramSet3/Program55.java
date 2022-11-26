import java.util.Scanner;

abstract class PrimeorArmstrong {
	abstract void primeORarmstrong();
}

public class Program55 extends PrimeorArmstrong {

	public static void main(String[] args) {
		Program55 program = new Program55();
		program.primeORarmstrong();
	}

	public void primeORarmstrong() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt(), num = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				num++;
		}
		if (num == 0)
			System.out.println(a + " is a prime number");
		else
			System.out.println(a + " is not a prime number");
		int b = a, temp = 0, reverse = 0;
		while (b != 0) {
			temp = b % 10;
			if (b >= 1 && b <= 9)
				reverse = reverse + temp;
			else if (b >= 10 && b <= 99)
				reverse = reverse + (temp * temp);
			else if (b >= 100 && b <= 999)
				reverse = reverse + (temp * temp * temp);
			else if (b >= 1000 && b <= 9999)
				reverse = reverse + (temp * temp * temp * temp);
			b = b / 10;
		}
		if (a == reverse)
			System.out.println(reverse + " is an Armstrong Number");
		else
			System.out.println(reverse + " is not an Armstrong Number");
	}
}