abstract class Multiple {
	abstract void multiple();
}

public class Program62 extends Multiple {

	public static void main(String[] args) {
		Program62 program = new Program62();
		program.multiple();
	}

	public void multiple() {
		int a[][] = { { 7, 2 }, { 3, 4 } };
		int b[][] = { { 3, 6 }, { 1, 2 } };
		int c[][] = new int[a[0].length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				c[i][j] = 0;
				for (int k = 0; k < a[0].length; k++)
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