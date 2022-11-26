import java.util.Scanner;

class MobileNumber {
	long num;

	MobileNumber(long a) {
		this.num = a;
	}

	public void printMobileNumber() {
		System.out.println(num);
	}
}

public class Program1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Mobile number");
		MobileNumber n = new MobileNumber(s.nextLong());
		n.printMobileNumber();
	}
}