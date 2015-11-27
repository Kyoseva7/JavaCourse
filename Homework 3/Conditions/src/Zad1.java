import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Vuvedete 2 chisla: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		if (a < 0 && b < 0) {
			System.out.println(a + "/" + b + "= +");
		}
		if (a < 0 && b > 0) {
			System.out.println(a + "/" + b + "= -");
		}
		if (a > 0 && b < 0) {
			System.out.println(a + "/" + b + "= -");
		}
		if (a > 0 && b > 0) {
			System.out.println(a + "/" + b + "= +");
		}
		if (a == 0) {
			System.out.println(a + "/" + b + "= 0");
		}
		if (b == 0) {
			System.out.println("Opitai pak");
		}
		input.close();
	}

}
