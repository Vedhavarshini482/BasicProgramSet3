import java.util.Scanner;

abstract class MatrixEqual {
	protected abstract void matrixEqual();
}

public class Program93 extends MatrixEqual {

	public static void main(String[] args) {
		Program93 program = new Program93();
		program.matrixEqual();
	}

	protected void matrixEqual() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n1 = s.nextInt();
		int a[] = new int[n1];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n1; i++)
			a[i] = s.nextInt();
		System.out.println("Enter the size of 1st array");
		int n2 = s.nextInt();
		int b[] = new int[n2];
		System.out.println("Enter the elements of 2nd array");
		for (int i = 0; i < n2; i++)
			b[i] = s.nextInt();
		if (n1 != n2) {
			System.out.println("Matrices are not equal");
			System.exit(0);
		}
		for (int i = 0; i < n1; i++) {
			if (a[i] != b[i]) {
				System.out.println("Matrices are not equal");
				System.exit(0);
			}
		}
		System.out.println("Matrices are equal");
	}
}