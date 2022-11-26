import java.util.Scanner;

interface Sums {

	int number();

	int sum(int num);
}

public class Program99 implements Sums {

	public static void main(String[] args) {
		Program99 program = new Program99();
		int i = program.number();
		System.out.println("Sum of natural numbers " + program.sum(i));
	}

	public int number() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		return n;
	}

	public int sum(int num) {
		if (num > 0)
			return num += sum(num - 1);
		else
			return num;
	}
}
