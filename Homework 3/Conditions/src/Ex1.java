import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int a = input.nextInt();
		if (a < 0) {
			if (a % 2 == 0) {
				System.out.println(a + "is Negative Even");
			} else {
				System.out.println(a + "is Negative Odd");
			}
		} else if (a > 0) {
			if (a % 2 == 0) {
				System.out.println(a + "is Positive Even");
			} else {
				System.out.println(a + "is Positive Odd");
			}
		} else {
			System.out.println(a + "is Zero");
		}
		input.close();
	}

}
