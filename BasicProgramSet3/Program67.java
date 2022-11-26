import java.util.Scanner;

abstract class Pyramid3 {
	public void pyramid() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}

public class Program67 extends Pyramid3 {

	public static void main(String[] args) {
		Program67 program = new Program67();
		program.pyramid();
	}
}