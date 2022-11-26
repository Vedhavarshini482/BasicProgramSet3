import java.util.Scanner;

class Evaluation1 {

	void evaluation() {
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter two numbers");
			int a = s.nextInt(), b = s.nextInt();
			if (i == 1)
				System.out.println("++a-b–- = " + (++a - b--));
			else if (i == 2)
				System.out.println("a%b++  = " + (a % b++));
			else
				System.out.println("a*=b+5 is " + (a *= b + 5));
		}
		System.out.println("69>>>2 = " + (69 >>> 2));
	}
}

public class Program21 extends Evaluation1 {

	public static void main(String[] args) {
		Program21 program = new Program21();
		program.evaluation();
	}
}