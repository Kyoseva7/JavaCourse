import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Vuvedete 2 chisla: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		if (a > b) {
			System.out.println(a + " e po-golqmoto chislo");
		} else {
			System.out.println(b + " e po-golqmoto chislo");
		}
		input.close();
	}

}
