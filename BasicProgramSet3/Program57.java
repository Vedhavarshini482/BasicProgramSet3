import java.util.Scanner;

class ConversioN {

	public void conversion() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a binary number");
		String binary = s.next();
		int decimal = Integer.parseInt(binary, 2);
		System.out.println(decimal);
		System.out.println("Enter a decimal number");
		int number = s.nextInt();
		System.out.println(Integer.toBinaryString(number));
	}
}

public class Program57 extends ConversioN {

	public static void main(String[] args) {
		Program57 program = new Program57();
		program.conversion();
	}
}