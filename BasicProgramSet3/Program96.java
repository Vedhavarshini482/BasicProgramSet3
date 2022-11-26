import java.util.Scanner;

class LowerTriangle {

	public void lowerTriangle() {
		Scanner s = new Scanner(System.in);
		int a[][] = new int[3][3];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				a[i][j] = s.nextInt();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (i > j)
					a[i][j] = 0;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}
}

public class Program96 extends LowerTriangle {

	public static void main(String[] args) {
		Program96 program = new Program96();
		program.lowerTriangle();
	}
}