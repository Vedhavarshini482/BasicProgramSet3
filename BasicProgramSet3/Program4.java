class Numbers {

	void sameORdifferent() {
		float a = 6.02f;
		double b = 6.02d;
		if (a == b)
			System.out.println("Same");
		else
			System.out.println("Different");
	}
}

public class Program4 {

	public static void main(String[] args) {
		Numbers program = new Numbers();
		program.sameORdifferent();
	}
}