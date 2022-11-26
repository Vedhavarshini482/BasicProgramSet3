import java.util.Scanner;

abstract class Freq {

	public void frequency() {
		Scanner s = new Scanner(System.in);
		int a[][] = new int[3][3];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				a[i][j] = s.nextInt();
		int oddFreq = 0, evenFreq = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] % 2 == 0)
					evenFreq++;
				else
					oddFreq++;
			}
		}
		System.out.println("Odd number frequency = " + oddFreq);
		System.out.println("Even number frequency = " + evenFreq);
	}
}

public class Program98 extends Freq {

	public static void main(String[] args) {
		Program98 program = new Program98();
		program.frequency();
	}
}