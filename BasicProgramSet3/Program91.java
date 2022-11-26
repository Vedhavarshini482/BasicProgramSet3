import java.util.Scanner;

abstract class Identity {
	abstract void identityMatrix();
}

class IdentityMatrix extends Identity {

	public void identityMatrix() {
		Scanner s = new Scanner(System.in);
		int a[][] = new int[3][3];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				a[i][j] = s.nextInt();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i][i] == 1)
				count++;
		}
		if (count == a[0].length)
			System.out.println("Given matix is an Identity matrix");
		else
			System.out.println("Given matix is not an Identity matrix");
	}
}

public class Program91 {

	public static void main(String[] args) {
		IdentityMatrix program = new IdentityMatrix();
		program.identityMatrix();
	}
}