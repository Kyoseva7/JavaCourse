import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int n = input.nextInt();
		for (int i = 1; i < n; i++) {
			if (i % 3 == 0 || i % 7 == 0) {
				continue;
			}
			System.out.println(i);
		}
		input.close();
	}

}
