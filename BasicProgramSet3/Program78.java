import java.util.Scanner;

abstract class ElemetsCount {
	abstract void elementsCount();
}

public class Program78 extends ElemetsCount {

	public static void main(String[] args) {
		Program78 program = new Program78();
		program.elementsCount();
	}

	public void elementsCount() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		System.out.println(a.length + " elements present in an array");
	}
}