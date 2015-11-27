import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter an integer: ");
		int a = input.nextInt();

		if (a >= 1 && a <= 5) {
			if (a % 2 == 0) {
				System.out.println("The number is even");
			} else {
				System.out.println("The number is odd");
			}
		} else if (a >= 6 && a <= 15) {
			if (a % 3 == 0) {
				System.out.println("The number can be divided in 3");
			} else {
				System.out.println("The number can't be divided in 3");
			}
		} else {
			if (a > 0) {
				System.out.println("The number is positive");
			} else if (a == 0) {
				System.out.println("The numver is 0");
			} else {
				System.out.println("The number is negative");
			}
		}
		input.close();
	}

}
