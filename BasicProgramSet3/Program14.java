import java.util.Scanner;

class Cylinder {
	int radius, height;

	void setradius(int r) {
		this.radius = r;
	}

	void setheight(int h) {
		this.height = h;
	}
}

class Formula extends Cylinder {

	void areaOFcylinder() {
		System.out.println("Area of the Cylinder = "
				+ (int) ((2 * 3.14 * radius) * (radius + height)));
	}
}

public class Program14 {

	public static void main(String[] args) {
		Program14 program = new Program14();
		program.areaOfCylinder();
	}

	public void areaOfCylinder() {
		Formula f = new Formula();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius and height of the Cylinder");
		f.setradius(s.nextInt());
		f.setheight(s.nextInt());
		f.areaOFcylinder();
	}
}