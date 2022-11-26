import java.util.Scanner;

abstract class Swapping {
	public void swapNumbers() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = s.nextInt(), b = s.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}

public class Program31 extends Swapping {

	public static void main(String[] args) {
		Program31 program = new Program31();
		program.swapNumbers();
	}
}