import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete radiusa: ");
		int r = input.nextInt();
		double pi = 3.14;
		double C = 2 * pi * r;
		double S = pi * r * r;
		System.out.println("Liceto na kruga e = " + S);
		System.out.println("Perimetura na kruga e = " + C);
		input.close();
	}

}
