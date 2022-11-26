class ByteNumber {

	void byteNumber() {
		short shortNumber = 150;
		byte byteNumber = (byte) shortNumber;
		System.out.println(byteNumber);
	}
}

public class Program5 extends ByteNumber {

	public static void main(String[] args) {
		Program5 program = new Program5();
		program.byteNumber();
	}
}