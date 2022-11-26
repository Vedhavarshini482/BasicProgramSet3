import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface PRimeNUmber {
	void primeNumber();
}

public class Program56 implements PRimeNUmber {

	public static void main(String[] args) {
		Program56 program = new Program56();
		program.primeNumber();
	}

	public void primeNumber() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt(), j = 1;
		List<Integer> list = new ArrayList<Integer>();
		while (j <= n) {
			int num = 0;
			for (int i = 2; i < j; i++) {
				if (j % i == 0)
					num++;
			}
			if (num == 0)
				list.add(j);
			j++;
		}
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) + list.get(i + 1) == n) {
				System.out.println(n + " is equal to sum of two prime number "

				+ list.get(i) + " and " + list.get(i + 1));
				return;
			}
		}
		System.out.println(n + " is not equal to sum of two prime numbers ");
	}
}