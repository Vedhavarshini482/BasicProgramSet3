class Statement2 {

	public void statementDifferce() {
		System.out.println(7 + 7);
		System.out.println(7 + 7.0);
		System.out.println(7 + '7');
	}
}

public class Program9 extends Statement2 {

	public static void main(String[] args) {
		Program9 program = new Program9();
		program.statementDifferce();
	}
}