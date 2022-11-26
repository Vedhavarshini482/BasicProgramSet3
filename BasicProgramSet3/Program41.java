abstract class Fibonacci {

	public void fibonacci() {
		int a = 0, b = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.println(a);
			int temp = a + b;
			a = b;
			b = temp;
		}
	}
}

public class Program41 extends Fibonacci {

	public static void main(String[] args) {
		Program41 program = new Program41();
		program.fibonacci();
	}
}