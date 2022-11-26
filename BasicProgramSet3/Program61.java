import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class StringReverse {
	abstract void r1();

	abstract void r2();
}

class Sentence extends StringReverse {
	void r1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the sentence");
		int n = scanner.nextInt();
		System.out.println("Enter the sentence");
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++)
			list.add(scanner.next());
		String s = "";
		for (int i = list.size() - 1; i >= 0; i--)
			s += list.get(i) + " ";
		System.out.println("Reversed String: " + s);
	}

	void r2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s1[] = scanner.nextLine().split(" ");
		String s = "";
		for (int i = s1.length - 1; i >= 0; i--) {
			s += s1[i] + " ";
		}
		System.out.println("Reversed String: " + s);
	}
}

public class Program61 {

	public static void main(String[] args) {
		Sentence r = new Sentence();
		r.r1();
		r.r2();
	}
}