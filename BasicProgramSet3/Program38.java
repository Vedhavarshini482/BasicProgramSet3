import java.util.Scanner;

class NaturalNumbers {
	
	public void sumOfNatualNumbers() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;
		System.out.println("Sum = " + sum);
	}
}

public class Program38 extends NaturalNumbers {

	public static void main(String[] args) {
		Program38 program = new Program38();
		program.sumOfNatualNumbers();
	}
}