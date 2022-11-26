interface LongKeyword {
	
	void longKeyword();
}

public class Program30 implements LongKeyword {

	public static void main(String[] args) {
		Program30 program = new Program30();
		program.longKeyword();
	}

	public void longKeyword() {
		System.out.println(Long.SIZE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}
}