import java.util.Scanner;

public class Program36 extends Number {

	public static void main(String[] args) {
		Number program = new Program36();
		program.postiveORnegative();
	}
}

class Number {
	
	public void postiveORnegative() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		if (a > 0)
			System.out.println(a + " is a postive number");
		else
			System.out.println(a + " is a negative number");
	}
}