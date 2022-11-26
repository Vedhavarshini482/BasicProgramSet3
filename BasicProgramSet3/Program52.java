import java.util.Scanner;

interface Factors {
	void factors();
}

public class Program52 implements Factors {

	public static void main(String[] args) {
		Program52 program = new Program52();
		program.factors();
	}

	public void factors() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		System.out.println("Factors of " + n + " : ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				System.out.println(i);
		}
	}
}