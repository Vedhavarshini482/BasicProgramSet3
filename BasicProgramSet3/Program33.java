import java.util.Scanner;

class Character {

	public void vowelORconsonant() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = s.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
				|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'
				|| ch == 'U')
			System.out.println(ch + " is a vowel");
		else
			System.out.println(ch + " is a consonant");
	}
}

public class Program33 {

	public static void main(String[] args) {
		Character program = new Character();
		program.vowelORconsonant();
	}
}