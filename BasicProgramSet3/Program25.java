interface Evaluate2 {
	void evaluation();
}

public class Program25 implements Evaluate2 {

	public static void main(String[] args) {
		Program25 program = new Program25();
		program.evaluation();
	}

	public void evaluation() {
		int x = 5;
		int x1 = ++x - x++ + --x;
		System.out.println(" ++x - x++ + --x = " + x1);
	}
}