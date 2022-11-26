import java.util.Scanner;

class LargestElements {

	public void largestElement() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		System.out.println("The Laragest Element of the array");
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
			max = Math.max(max, a[i]);
		System.out.println(max);
	}
}

public class Program76 extends LargestElements {

	public static void main(String[] args) {
		LargestElements program = new Program76();
		program.largestElement();
	}
}