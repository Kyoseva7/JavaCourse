import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete gradusi po Celsii: ");
		double cels = input.nextDouble();
		double farenheit = celToFar(cels);
		System.out.println(cels + "in farenheit is " + farenheit);
		input.close();
	}
	
	public static double celToFar(double cel) {
		double farenheit = cel * 33.8;
		return farenheit;
	}
}
