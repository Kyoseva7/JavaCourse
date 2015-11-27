import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int a = input.nextInt();
		int min = a;
		int  max = a;
		for (int i = 0; i < 7; i++) {
			System.out.println("Vuvedete chislo: ");
			a = input.nextInt();
			if (max < a) {
				max = a;
			}
			if (min > a) {
				min = a;
			}
		}
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		input.close();
	}

}
