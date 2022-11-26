import java.util.Scanner;

class Pyramid1 {

	public void pyramid() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(i + " ");
			System.out.println();
		}
	}
}

public class Program65 extends Pyramid1 {

	public static void main(String[] args) {
		Program65 program = new Program65();
		program.pyramid();
	}
}