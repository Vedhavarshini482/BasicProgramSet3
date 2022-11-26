import java.util.Scanner;

class Power {

	public void powerOfNumber() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number and its power");
		int a = s.nextInt(), b = s.nextInt();
		int power = 1;
		for (int i = 1; i <= b; i++)
			power *= a;
		System.out.println(a + " power " + b + " is " + power);
	}
}

public class Program47 {

	public static void main(String[] args) {
		Power program = new Power();
		program.powerOfNumber();
	}
}