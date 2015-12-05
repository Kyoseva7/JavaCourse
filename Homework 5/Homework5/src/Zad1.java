import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete 3 chisla: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int max = maxNum(a,b);
		max = maxNum(max,c);
		System.out.println(max);
		input.close();
	}
	public static int maxNum(int a, int b) {
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return (max);
	}
}
