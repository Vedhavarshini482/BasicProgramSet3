import java.util.Scanner;

abstract class PassingArg {
	abstract void matrix(int a[][], int b[][]);
}

public class Program64 extends PassingArg {

	public static void main(String[] args) {
		Program64 program = new Program64();
		Scanner s = new Scanner(System.in);
		int a[][] = new int[3][2];
		int b[][] = new int[2][2];
		System.out.println("Enter a 3X2 matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++)
				a[i][j] = s.nextInt();
		}
		System.out.println("Enter a 2X2 matrix");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++)
				b[i][j] = s.nextInt();
		}
		program.matrix(a, b);
	}

	public void matrix(int a[][], int b[][]) {
		if (a[0].length != b.length) {
			System.out.println("You entered a invalid matrix");
			System.exit(0);
		}
		int c[][] = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = 0;
				for (int k = 0; k < b[0].length; k++)
					c[i][j] += a[i][k] * b[k][j];
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
	}
}