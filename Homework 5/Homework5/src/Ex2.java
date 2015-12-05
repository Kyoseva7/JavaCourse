import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int n = input.nextInt();
		if(n < 10 || n > 30000) {
			System.out.println("Opitai pak!");
		} else {
			int sum = sumNum(n);
			System.out.println(sum);
		}
			input.close();
	}
	public static int sumNum(int a) {
		if (a == 1) {
			return a;
		} else {
			return a + sumNum(a-1);
		}
	}
}
