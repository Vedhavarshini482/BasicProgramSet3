import java.util.Scanner;

public class Program90 {

	public static void main(String[] args) {
		Program90 program = new Program90();
		program.matrixSubtraction();
	}

	public void matrixSubtraction() {
		Scanner s = new Scanner(System.in);
		int a[][] = new int[2][2];
		System.out.println("Enter the elements of the 1st array");
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				a[i][j] = s.nextInt();
		int b[][] = new int[2][2];
		System.out.println("Enter the elements of the 2nd array");
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				b[i][j] = s.nextInt();
		int c[][] = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				c[i][j] = a[i][j] - b[i][j];
		System.out.println("Matrix subtraction result is ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
	}
}
