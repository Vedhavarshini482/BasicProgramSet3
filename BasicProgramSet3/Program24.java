interface Evaluate {
	void evaluation();
}

class Evaluation4 implements Evaluate {

	public void evaluation() {
		int y = 10;
		int z = (++y * (y++ + 5));
		System.out.println("(++y * (y++ + 5)) = " + z);
	}
}

public class Program24 {

	public static void main(String[] args) {
		Evaluation4 program = new Evaluation4();
		program.evaluation();
	}
}