import java.util.Scanner;

abstract class LeftRotate {

	public void leftRotate() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int b[] = new int[a.length];
		System.out.println("Enter how many times rotate the array");
		int rotate = s.nextInt();
		for (int i = 0; i < rotate; i++) {
			b[a.length - 1] = a[0];
			for (int j = 1, k = 0; j < a.length; j++, k++)
				b[k] = a[j];
			a = b.clone();
		}
		System.out.println("After " + rotate + " rotation");
		for (int i = 0; i < b.length; i++)
			System.out.print(a[i] + " ");
	}
}

public class Program81 extends LeftRotate {

	public static void main(String[] args) {
		Program81 program = new Program81();
		program.leftRotate();
	}

}
