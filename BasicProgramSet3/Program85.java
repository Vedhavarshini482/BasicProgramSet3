import java.util.Scanner;

interface Large {
	void largestNumber();
}

class LargestNumber implements Large {

	public void largestNumber() {
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
		System.out.println("The second Largest number is " + a[a.length - 2]);
	}
}

public class Program85 extends LargestNumber {

	public static void main(String[] args) {
		Program85 program = new Program85();
		program.largestNumber();
	}
}