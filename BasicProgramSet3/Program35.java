import java.util.Scanner;

abstract class Roots {
	int a;
	int b;
	int c;

	int geta(int a) {
		return a;
	}

	int getb(int a) {
		return b;
	}

	int getc(int a) {
		return c;
	}

	void seta(int a) {
		this.a = a;
	}

	void setb(int a) {
		this.b = a;
	}

	void setc(int a) {
		this.c = a;
	}

	abstract void root1();

	abstract void root2();
}

class Root extends Roots {
	void display() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three values");
		Root r = new Root();
		r.seta(s.nextInt());
		r.setb(s.nextInt());
		r.setc(s.nextInt());
	}

	void root1() {
		System.out.println("Root1 = " + (-b + Math.sqrt(b * b - 4 * a * c)) / 2
				* a);
	}

	void root2() {
		System.out.println("Root2 = " + (-b - Math.sqrt(b * b - 4 * a * c)) / 2
				* a);
	}
}

public class Program35 {

	public static void main(String[] args) {
		Program35 program = new Program35();
		program.execution();
	}

	void execution() {
		Root r = new Root();
		r.display();
		r.root1();
		r.root2();
	}
}