class Integers {

	public void intNumber() {
		float floatNumber = 150.9f;
		int intNumber = (int) floatNumber;
		System.out.println(intNumber);
	}
}

public class Program6 extends Integers {

	public static void main(String[] args) {
		Program6 program = new Program6();
		program.intNumber();
	}
}