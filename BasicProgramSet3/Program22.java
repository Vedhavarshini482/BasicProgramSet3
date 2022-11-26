class Evaluation2 {

	void evaluation() {
		int a = 28;
		System.out.println("a+=a++ + ++a + --a + a-– is "
				+ (a += (a++) + (++a) + (--a) + (a--)));
	}
}

public class Program22 {

	public static void main(String[] args) {
		Evaluation2 e = new Evaluation2();
		e.evaluation();
	}
}