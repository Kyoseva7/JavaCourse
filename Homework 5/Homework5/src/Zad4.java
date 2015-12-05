import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int a = input.nextInt();
		oddOrEven(a);
		input.close();
	}
	
	public static void oddOrEven(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}
	}

}
