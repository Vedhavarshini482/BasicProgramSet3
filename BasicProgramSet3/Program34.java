import java.util.Scanner;

interface LargeNumber {
	void largestNumber();
}

public class Program34 implements LargeNumber {

	public static void main(String[] args) {
		Program34 program = new Program34();
		program.largestNumber();
	}

	public void largestNumber() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
		if (a > b && a > c)
			System.out.println("a is the Largest Number");
		else if (b > a && b > c)
			System.out.println("b is the Largest Number");
		else
			System.out.println("c is the Largest Number");
	}
}