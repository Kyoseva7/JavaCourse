import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete duljina na pravougulnika: ");
		double a = input.nextDouble();
		System.out.println("Vuvedete shirinata na pravougulnika: ");
		double b = input.nextDouble();
		double s = a * b;
		System.out.println("liceto na pravougulnika e: " + s);
		input.close();
	}

}
