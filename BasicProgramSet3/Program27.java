import java.util.Scanner;

interface Year {
	void leapYear();
}

class LeapYear implements Year {
	public void leapYear() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = s.nextInt();
		if (year % 4 == 0)
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");
	}
}

public class Program27 {

	public static void main(String[] args) {
		LeapYear program = new LeapYear();
		program.leapYear();
	}
}