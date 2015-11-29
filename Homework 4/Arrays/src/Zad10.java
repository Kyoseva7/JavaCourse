import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int a = input.nextInt();
		int b = 0;
		do {
			System.out.println("Vuvedete po-golqmo chislo ot " + a);
			b = input.nextInt();
		} while (b < a);
		for (int i = a; i < b; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		input.close();
	}

}
