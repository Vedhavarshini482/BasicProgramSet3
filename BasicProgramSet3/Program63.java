class Transpose {

	public void transpose() {
		int a[][] = { { 4, 8 }, { 12, 1 } };
		int transpose[][] = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++)
				transpose[i][j] = a[j][i];
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++)
				System.out.print(transpose[i][j] + " ");
			System.out.println();
		}
	}
}

public class Program63 {

	public static void main(String[] args) {
		Transpose program = new Transpose();
		program.transpose();
	}
}