import java.util.Scanner;

class Armstrong {

	public void armstrongNumber() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		int b = a, temp = 0, reverse = 0;
		if (a >= 100 && a <= 999) {
			while (a != 0) {
				temp = a % 10;
				reverse = reverse + (temp * temp * temp);
				a = a / 10;
			}
		}
		if (b == reverse)
			System.out.println(b + " is an Armstrong Number");
		else
			System.out.println(b + " is not an Armstrong Number");
	}
}

public class Program50 {

	public static void main(String[] args) {
		Armstrong program = new Armstrong();
		program.armstrongNumber();
	}
}