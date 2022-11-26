import java.util.Scanner;

class Operator {

	void unaryOperator() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = s.nextInt();
		System.out.println("+a  = " + (+a));
		System.out.println("-a  = " + (-a));
		System.out.println("a++ = " + (a++));
		System.out.println("++a = " + (++a));
		System.out.println("a-- = " + (a--));
		System.out.println("--a = " + (--a));
	}
}

public class Program17 {

	public static void main(String[] args) {
		Operator program = new Operator();
		program.unaryOperator();
	}
}