import java.util.Scanner;

abstract class Digit {

	public void digits() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		String st = Integer.toString(a);
		System.out.println(a + " is a " + st.length() + " digit number");
	}
}

class Digits extends Digit {

}

public class Program45 {

	public static void main(String[] args) {
		Digits program = new Digits();
		program.digits();
	}
}