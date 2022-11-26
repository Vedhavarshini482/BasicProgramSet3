class Statement {
	public void statementDifference() {
		System.out.println(true);
		System.out.println(false);
		System.out.println(true & true);
		System.out.println(true & false);
	}
}

public class Program10 extends Statement {

	public static void main(String[] args) {
		Program10 program = new Program10();
		program.statementDifference();
	}
}