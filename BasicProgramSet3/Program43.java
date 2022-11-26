import java.util.Scanner;

class Lcm {

	public void lcm() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = s.nextInt(), b = s.nextInt(), gcd = 1, lcm = 1;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0)
				gcd = i;
		}
		lcm = (a * b) / gcd;
		System.out.println("LCM of " + a + " and " + b + " is " + lcm);
	}
}

public class Program43 extends Lcm {

	public static void main(String[] args) {
		Program43 program = new Program43();
		program.lcm();
	}
}