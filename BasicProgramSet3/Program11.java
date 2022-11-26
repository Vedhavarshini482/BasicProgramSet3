class WithoutString {
	public void printNumber() {
		System.out.printf("%.2f", 7.50);
	}
}

public class Program11 extends WithoutString {

	public static void main(String[] args) {
		WithoutString program = new Program11();
		program.printNumber();
	}
}