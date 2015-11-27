import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int n = input.nextInt();
		int faktN = 1;
		int faktK = 1;
		if (n > 1) {
			for (int i = 1; i < n; i++) {
			faktN = faktN * i;
			}
		}
		System.out.println("Vuvedete chislo: ");
		int k = input.nextInt();
		if (k > 1 && k < n) {
			for (int i = 1; i < k; i++) {
			faktK = faktK * i;
			}
		}
		System.out.println("N! / K! = " + (double) faktN / faktK);
		input.close();
	}

}
