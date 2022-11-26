import java.util.Scanner;

class CopyElements {

	public void copyElemets() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++)
			b[i] = a[i];
		System.out.println("The Copied Elements are ");
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
	}
}

public class Program79 {

	public static void main(String[] args) {
		CopyElements program = new CopyElements();
		program.copyElemets();
	}
}