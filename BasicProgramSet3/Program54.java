import java.util.Scanner;

abstract class NumberPrime {
	abstract void primeNumber();
}

class Prgrm extends NumberPrime {

	public void primeNumber() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Starting and finishing point");
		int a = s.nextInt(), b = s.nextInt();
		while (a <= b) {
			int num = 0;
			for (int i = 2; i < a; i++) {
				if (a % i == 0)
					num++;
			}
			if (num == 0)
				System.out.println(a);
			a++;
		}
	}
}

public class Program54 {

	public static void main(String[] args) {
		Prgrm program = new Prgrm();
		program.primeNumber();
	}
}