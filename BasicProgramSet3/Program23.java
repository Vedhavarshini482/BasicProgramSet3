import java.util.Scanner;

class Evaluation3 {

	void evaluation() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = s.nextInt();
		System.out.println("x = x++ * 2 + 3 * -–x is "
				+ (x = x++ * 2 + 3 * --x));
	}
}

public class Program23 {

	public static void main(String[] args) {
		Evaluation3 program = new Evaluation3();
		program.evaluation();
	}
}