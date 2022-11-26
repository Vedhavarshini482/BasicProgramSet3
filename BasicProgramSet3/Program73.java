import java.util.Scanner;

class ReverseOrder {

	public void reverseOrder() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		System.out.println("The Elements of an array in Reverse Order");
		for (int i = a.length - 1; i >= 0; i--)
			System.out.print(a[i] + " ");
	}
}

public class Program73 extends ReverseOrder {

	public static void main(String[] args) {
		Program73 program = new Program73();
		program.reverseOrder();
	}
}