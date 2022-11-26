import java.util.Scanner;

interface Frequency {
	abstract void frequency();
}

public class Program80 implements Frequency {

	public static void main(String[] args) {
		Program80 program = new Program80();
		program.frequency();
	}

	public void frequency() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int count = 0;
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					b[j] = -1;
				}
			}
			if (b[i] != -1)
				b[i] = count;
		}
		for (int i = 0; i < b.length; i++)
			if (b[i] != -1)
				System.out.println(a[i] + " occurs " + b[i] + " times");
	}
}