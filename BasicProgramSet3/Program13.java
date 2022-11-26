import java.util.Scanner;

class RectangleArea {

	protected void area() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle");
		int length = s.nextInt(), breadth = s.nextInt();
		System.out.println("Area of the rectangle = " + (length * breadth));
	}
}

public class Program13 extends RectangleArea {

	public static void main(String[] args) {
		RectangleArea area = new RectangleArea();
		area.area();
	}
}