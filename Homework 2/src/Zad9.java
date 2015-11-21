import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int a = input.nextInt();
		System.out.println("Vuvedete chislo: ");
		int b = input.nextInt();
		System.out.println("a % b = " + a % b);
		input.close();
	}

}
