import java.util.Scanner;

class SmallestElemets {

	public void smallestElement() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		System.out.println("The Smallest Element of the array");
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++)
			min = Math.min(min, a[i]);
		System.out.println(min);
	}
}

public class Program77 extends SmallestElemets {

	public static void main(String[] args) {
		SmallestElemets program = new SmallestElemets();
		program.smallestElement();
	}
}