import java.util.Scanner;

abstract class Ascending {
	abstract void ascendingOrder();
}

public class Program88 extends Ascending {

	public static void main(String[] args) {
		Program88 program = new Program88();
		program.ascendingOrder();
	}

	public void ascendingOrder() {
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
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		}
		System.out.println("Array in ascending order");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}