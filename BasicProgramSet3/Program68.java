import java.util.Scanner;

interface Pyramid4 {
	public void pyramid();
}

public class Program68 implements Pyramid4 {

	public static void main(String[] args) {
		Program68 program = new Program68();
		program.pyramid();
	}

	public void pyramid() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * (n - i); j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			for (int j = i; j > 1; j--)
				System.out.print(j - 1 + " ");
			System.out.println();
		}
	}
}