import java.util.Scanner;

interface PYramid {
	void pyramid();
}

class Pyramid7 implements PYramid {

	public void pyramid() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = i; j < n; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(i + " ");
			System.out.println();
		}
	}
}

public class Program71 {

	public static void main(String[] args) {
		Pyramid7 program = new Pyramid7();
		program.pyramid();
	}
}