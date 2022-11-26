class Difference1 {

	protected void sameORdifferent() {
		int a = 6;
		long b = 6l;
		if (a == b)
			System.out.println("Same");
		else
			System.out.println("Different");
	}
}

public class Program3 {

	public static void main(String[] args) {
		Difference1 program = new Difference1();
		program.sameORdifferent();
	}
}