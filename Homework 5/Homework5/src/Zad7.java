import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int n = input.nextInt();
		int factor = factoriel(n);
		System.out.println(factor);		
		input.close();
	}
	public static int factoriel(int a) {
		if (a == 1) {
			return a;
		} else {
			return a * factoriel(a-1);
		}
	}
}
