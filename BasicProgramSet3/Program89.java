import java.util.Scanner;

abstract class Descending {
	abstract void descendingOrder();
}

public class Program89 extends Descending {

	public static void main(String[] args) {
		Program89 program = new Program89();
		program.descendingOrder();
	}

	public void descendingOrder() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < a.length; j++)
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		}
		System.out.println("Array in Descending order");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}