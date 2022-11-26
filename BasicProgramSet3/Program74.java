import java.util.Scanner;

abstract class Evenposition {

	public void evenPosition() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		System.out.println("The Elements of an array in Even Position");
		for (int i = 0; i < a.length; i += 2)
			System.out.print(a[i] + " ");
	}
}

public class Program74 extends Evenposition {

	public static void main(String[] args) {
		Program74 program = new Program74();
		program.evenPosition();
	}
}