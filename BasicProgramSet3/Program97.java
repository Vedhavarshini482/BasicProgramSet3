import java.util.Scanner;

interface RowandColumn {
	void sumOfRowAndColumn();
}

public class Program97 implements RowandColumn {

	public static void main(String[] args) {
		Program97 program = new Program97();
		program.sumOfRowAndColumn();
	}

	public void sumOfRowAndColumn() {
		Scanner s = new Scanner(System.in);
		int a[][] = new int[3][3];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				a[i][j] = s.nextInt();
		int row[] = new int[a.length];
		int col[] = new int[a[0].length];
		for (int i = 0; i < a.length; i++) {
			int rowSum = 0, colSum = 0;
			for (int j = 0; j < a[0].length; j++) {
				rowSum += a[i][j];
				colSum += a[j][i];
			}
			row[i] = rowSum;
			col[i] = colSum;
		}
		System.out.println("Sum of each row is given below");
		for (int i = 0; i < row.length; i++)
			System.out.println("Sum of " + i + " row = " + row[i]);
		for (int i = 0; i < col.length; i++)
			System.out.println("Sum of " + i + " column = " + col[i]);
	}
}