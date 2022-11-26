class Printnumber {
	public void printNumber() {
		for (byte i = 1; i <= 10; i++)
			System.out.println(i);
	}
}

public class Program2 {

	public static void main(String[] args) {
		Printnumber program = new Printnumber();
		program.printNumber();
	}
}