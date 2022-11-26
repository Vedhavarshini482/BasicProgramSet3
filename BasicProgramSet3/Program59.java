import java.util.Scanner;

interface Conversion3 {
	void conversion();
}

public class Program59 implements Conversion3 {

	public static void main(String[] args) {
		Program59 program = new Program59();
		program.conversion();
	}

	public void conversion() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Binary number");
		String binary = s.next();
		int octal = Integer.parseInt(binary, 2);
		System.out.println(Integer.toOctalString(octal));
		System.out.println("Enter a Octal number");
		String s1 = s.next();
		int a = Integer.parseInt(s1, 8);
		System.out.println(Integer.toBinaryString(a));
	}
}