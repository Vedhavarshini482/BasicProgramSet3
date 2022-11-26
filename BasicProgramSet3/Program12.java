import java.util.Scanner;

class Area {
	public void area() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the side of the square");
		int side = s.nextInt();
		System.out.println("Area of the square = " + (side * side));
	}
}

public class Program12 extends Area {

	public static void main(String args[]) {
		Area program = new Area();
		program.area();
	}
}