import java.util.Scanner;

abstract class Oddposition {

	public void oddPosition() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		System.out.println("The Elements of an array in Odd Position");
		for (int i = 1; i < a.length; i += 2)
			System.out.print(a[i] + " ");
	}
}

public class Program75 extends Oddposition {

	public static void main(String[] args) {
		Program75 program = new Program75();
		program.oddPosition();
	}
}