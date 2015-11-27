import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int a = input.nextInt();
		int sum = 0;
		while (a != 0) {
			sum = sum + a;
			System.out.println("Vuvedete chislo: ");
			a = input.nextInt();
		}
		System.out.println("Sumata e: " + sum);
		input.close();
	}

}
