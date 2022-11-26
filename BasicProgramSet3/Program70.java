import java.util.Scanner;

abstract class PyramiDs {
	abstract void pyramid();
}

class Pyramid6 extends PyramiDs {

	public void pyramid() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = i; j < n; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}

public class Program70 {

	public static void main(String[] args) {
		Pyramid6 program = new Pyramid6();
		program.pyramid();
	}
}