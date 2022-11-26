import java.util.Scanner;

class RightRotate {

	public void rightRotate() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int b[] = new int[a.length];
		System.out.println("Enter how many time rotate in right direction");
		int rotate = s.nextInt();
		for (int i = 0; i < rotate; i++) {
			b[0] = a[a.length - 1];
			for (int j = 0, k = 1; j < a.length - 1; j++, k++)
				b[k] = a[j];
			a = b.clone();
		}
		System.out.println("After " + rotate + " rotate in right direction");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}

public class Program84 extends RightRotate {

	public static void main(String[] args) {
		RightRotate program = new Program84();
		program.rightRotate();
	}
}