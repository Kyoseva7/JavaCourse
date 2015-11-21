import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete stranata na triugulnika: ");
		int a = input.nextInt();
		System.out.println("Vuvedete visochinata na triugulnika: ");
		int ha = input.nextInt();
		int S = a * ha;
		System.out.println("s = " + S);
		input.close();
	}

}
