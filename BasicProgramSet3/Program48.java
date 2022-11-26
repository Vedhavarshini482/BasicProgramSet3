import java.util.Scanner;

class Palindrome {

	final void palindrome() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		int b = a;
		int temp = 0, reverse = 0;
		while (a != 0) {
			temp = a % 10;
			reverse = (reverse * 10) + temp;
			a = a / 10;
		}
		System.out.println(b == reverse ? (b + " is a Palindrome")
				: (b + " is not a Palindrome"));
	}
}

public class Program48 {

	public static void main(String[] args) {
		Palindrome program = new Palindrome();
		program.palindrome();
	}
}