import java.util.Scanner;

class MulTable {
	
	public void multiplicationTable() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number for multiplication table");
		int n = s.nextInt();
		for (int i = 1; i <= 20; i++)
			System.out.println(i + " * " + n + " = " + (i * n));
	}
}

public class Program40 extends MulTable {

	public static void main(String[] args) {
		Program40 program = new Program40();
		program.multiplicationTable();
	}
}