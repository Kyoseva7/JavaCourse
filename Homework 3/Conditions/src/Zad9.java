import java.util.Scanner;

public class Zad9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] arr = new double [5];
		System.out.println("Vuvedete 5 chisla");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextDouble();
		}
		double max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Nai-golqmoto chislo e " + max);
		input.close();
	}

}
