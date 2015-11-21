import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete cyalo chislo: ");
		int a = input.nextInt();
		System.out.println("Vuvedete cyalo chislo: ");
		int b = input.nextInt();
		System.out.println("Vuvedete cyalo chislo: ");
		int c = input.nextInt();
		System.out.println("Vuvedete cyalo chislo: ");
		int d = input.nextInt();
		int sum = a + b + c + d;
		System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + sum);
		input.close();
	}

}
