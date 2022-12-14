import java.util.Scanner;

abstract class Circle {
	abstract void concentricCircleArea();
}

class ConcentricCircle extends Circle {
	public void concentricCircleArea() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of the inner and outer circle");
		int in = s.nextInt(), out = s.nextInt();
		System.out.println("Space between two concentric circle = "
				+ ((22 * (in + out) * (in - out)) / 7));
	}
}

public class Program16 {

	public static void main(String[] args) {
		ConcentricCircle program = new ConcentricCircle();
		program.concentricCircleArea();
	}
}