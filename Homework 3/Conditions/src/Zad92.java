import java.util.Scanner;

public class Zad92 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete 5 chisla: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double max = a;
		if (max < b) {
			max = b;
		} else if (max < c) {
			max = c;
		} else if (max < d) {
			max = d;
		} else if (max < e) {
			max = e;
		}
		System.out.println("Nai-golqmoto chislo e " + max);
		input.close();
	}

}
