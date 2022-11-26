import java.util.Scanner;

abstract class Convo {

	abstract void kmTOmiles();

	abstract void centigradeTOfahrenheit();

	abstract void sqftTOacre();
}

class Conversions extends Convo {
	void kmTOmiles() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Kilometer");
		int a = s.nextInt();
		System.out.println("Mile = " + (a / 1.609));
	}

	void centigradeTOfahrenheit() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Centigrade");
		int a = s.nextInt();
		System.out.println("Fahrenheit = " + ((a * 9 / 5) + 32));
	}

	void sqftTOacre() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Square feet");
		int a = s.nextInt();
		System.out.println("Acre = " + (float) (a / 43560));
	}
}

public class Program26 {

	public static void main(String[] args) {
		Program26 program = new Program26();
		program.display();
	}

	void display() {
		Conversions c = new Conversions();
		c.kmTOmiles();
		c.centigradeTOfahrenheit();
		c.sqftTOacre();
	}
}