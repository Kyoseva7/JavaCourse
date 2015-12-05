import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete 3 chisla: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int res = proizv (a, b, c);
		System.out.println(res);
		input.close();
	}
	public static int proizv (int a, int b, int c) {
		int result = 1;
		result = a * b * c;
		return result;
	}
}
