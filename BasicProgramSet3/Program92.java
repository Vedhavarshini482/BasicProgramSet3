import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class OddEven {

	public void oddEven() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		List<Integer> odd = new ArrayList<Integer>();
		List<Integer> even = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				even.add(a[i]);
			else
				odd.add(a[i]);
		}
		System.out.println("Odd numbers are\n" + odd);
		System.out.println("Even numbers are\n" + even);
	}
}

public class Program92 extends OddEven {

	public static void main(String[] args) {
		Program92 program = new Program92();
		program.oddEven();
	}

}