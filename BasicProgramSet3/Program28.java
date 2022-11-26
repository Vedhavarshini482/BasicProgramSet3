import java.util.Scanner;

interface AsciiValue {
	void asciiCharacter();
}

class Ascii implements AsciiValue {

	public void asciiCharacter() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = s.next().charAt(0);
		System.out.println("ASCII value of \'" + ch + "\' is " + (int) ch);
	}
}

public class Program28 extends Ascii {

	public static void main(String[] args) {
		Program28 program = new Program28();
		program.asciiCharacter();
	}
}