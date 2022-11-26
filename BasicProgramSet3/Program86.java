import java.util.Scanner;

interface Small {
	void smallestNumber();
}

class SmallestNumber implements Small {

	public void smallestNumber() {
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
		System.out.println("The second Smallest number is " + a[1]);
	}
}

public class Program86 extends SmallestNumber {

	public static void main(String[] args) {
		SmallestNumber program = new Program86();
		program.smallestNumber();
	}
}