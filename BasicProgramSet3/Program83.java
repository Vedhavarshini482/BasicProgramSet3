import java.util.Scanner;

abstract class SumOfArray {
	abstract void sumOfArray();
}

public class Program83 extends SumOfArray {

	public static void main(String[] args) {
		Program83 program = new Program83();
		program.sumOfArray();
	}

	public void sumOfArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		System.out.println("Sum of Array is " + sum);
	}
}