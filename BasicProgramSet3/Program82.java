import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Duplicate {

	protected void duplicate() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count > 1)
				list.add(a[i]);
		}
		System.out.println("Duplicates elements are " + list);
	}
}

public class Program82 {

	public static void main(String[] args) {
		Duplicate program = new Duplicate();
		program.duplicate();
	}
}