import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int n = input.nextInt();
		for (int i = 1; i < n; i++) {
			System.out.println(i);
		}
		input.close();
	}

}
