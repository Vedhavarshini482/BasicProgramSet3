import java.util.Scanner;

interface Rev {
	public void stringReverseNumber();

	public void reverseNumber();
}

class Reverse implements Rev {
	public void stringReverseNumber() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		String s1 = Integer.toString(a);
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--)
			s2 += s1.charAt(i);
		int b = Integer.parseInt(s2);
		System.out.println("Reversed Number = " + b);
	}

	public void reverseNumber() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		int temp = 0, reverse = 0;
		while (a != 0) {
			temp = a % 10;
			reverse = (reverse * 10) + temp;
			a = a / 10;
		}
		System.out.println("Reversed Number = " + reverse);
	}
}

public class Program46 {

	public static void main(String[] args) {
		Reverse r = new Reverse();
		r.stringReverseNumber();
		r.reverseNumber();
	}
}