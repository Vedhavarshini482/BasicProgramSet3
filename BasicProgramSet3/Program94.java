import java.util.Scanner;

interface Sparse {
	abstract void sparseMatrix();
}

public class Program94 implements Sparse {

	public static void main(String[] args) {
		Program94 program = new Program94();
		program.sparseMatrix();
	}

	public void sparseMatrix() {
		Scanner s = new Scanner(System.in);
		int a[][] = new int[3][3];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				a[i][j] = s.nextInt();
		int zero = 0, number = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++)
				if (a[i][j] != 0)
					number++;
				else
					zero++;
		}
		if (zero > number)
			System.out.println("Given Matrix is a sparse matrix");
		else
			System.out.println("Given Matrix is not a sparse matrix");
	}
}