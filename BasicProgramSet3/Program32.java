import java.util.Scanner;

abstract class UserInput {

	public void oddOReven() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		if (a % 2 == 0)
			System.out.println(a + " is a even number");
		else
			System.out.println(a + " is a odd number");
	}
}

public class Program32 extends UserInput {

	public static void main(String[] args) {
		Program32 program = new Program32();
		program.oddOReven();
	}
}