interface Addition {
	abstract void matrixAddition();
}

public class Program60 implements Addition {

	public static void main(String[] args) {
		Program60 program = new Program60();
		program.matrixAddition();
	}

	public void matrixAddition() {
		int a[][] = { { 1, 2 }, { 3, 4 } };
		int b[][] = { { 5, 6 }, { 7, 8 } };
		int c[][] = new int[a[0].length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Addtion of two matrices");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
	}
}