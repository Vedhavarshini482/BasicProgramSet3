import java.util.Scanner;

interface Pyramid5 {
	abstract void pyramid();
}

public class Program69 implements Pyramid5 {

	public static void main(String[] args) {
		Program69 program = new Program69();
		program.pyramid();
	}

	public void pyramid() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = 2 * i; j > 1; j--)
				System.out.print(" ");
			for (int j = i; j <= n; j++)
				System.out.print(j + " ");
			for (int j = n; j > i; j--)
				System.out.print(j - 1 + " ");
			System.out.println();
		}
	}
}