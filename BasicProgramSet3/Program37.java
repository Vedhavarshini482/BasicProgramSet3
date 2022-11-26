import java.util.Scanner;

class Alphabet {

	public void alphabet() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = s.next().charAt(0);
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println(ch + " is an alphabet");
		else
			System.out.println(ch + " is not an alphabet");
	}
}

public class Program37 {

	public static void main(String[] args) {
		Alphabet program = new Alphabet();
		program.alphabet();
	}
}