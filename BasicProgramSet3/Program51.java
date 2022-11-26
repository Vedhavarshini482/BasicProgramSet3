import java.util.Scanner;

class ArmstrongNumber {

	public void armstrong() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int a = s.nextInt(), b = s.nextInt();
		if (b <= 9999) {
			while (a <= b) {
				int j = a;
				int temp = 0, reverse = 0;
				while (j != 0) {
					temp = j % 10;
					if (a >= 1 && a <= 9)
						reverse = reverse + temp;
					else if (a >= 10 && a <= 99)
						reverse = reverse + (temp * temp);
					else if (a >= 100 && a <= 999)
						reverse = reverse + (temp * temp * temp);
					else if (a >= 1000 && a <= 9999)
						reverse = reverse + (temp * temp * temp * temp);
					j = j / 10;
				}
				if (a == reverse)
					System.out.println(reverse);
				a++;
			}
		}
	}
}

public class Program51 extends ArmstrongNumber {

	public static void main(String[] args) {
		Program51 program = new Program51();
		program.armstrong();
	}
}