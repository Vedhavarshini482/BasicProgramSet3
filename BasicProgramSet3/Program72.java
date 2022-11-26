import java.util.Scanner;

class Prints {

	public void printElements() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		System.out.println("The Elements of an array");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}

public class Program72 extends Prints {

	public static void main(String[] args) {
		Program72 program = new Program72();
		program.printElements();
	}
}