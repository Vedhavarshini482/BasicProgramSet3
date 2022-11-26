import java.util.Scanner;

class UpperTriangle {

	public void upperTriangle() {
		Scanner s = new Scanner(System.in);
		int a[][] = new int[3][3];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				a[i][j] = s.nextInt();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (i < j)
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

public class Program95 {

	public static void main(String[] args) {
		UpperTriangle program = new UpperTriangle();
		program.upperTriangle();
	}
}