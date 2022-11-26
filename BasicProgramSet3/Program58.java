import java.util.Scanner;

abstract class Convert {
	abstract void conversion();
}

class Conversion2 extends Convert {

	public void conversion() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Octal number");
		String octal = s.next();
		int decimal = Integer.parseInt(octal, 8);
		System.out.println(decimal);
		System.out.println("Enter a decimal number");
		int number = s.nextInt();
		System.out.println(Integer.toOctalString(number));
	}
}

public class Program58 {

	public static void main(String[] args) {
		Conversion2 program = new Conversion2();
		program.conversion();
	}
}