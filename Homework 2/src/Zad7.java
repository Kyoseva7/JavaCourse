import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int num = input.nextInt();
		boolean del = (num % 7 == 0 && num % 5 == 0);
		System.out.println(num + " se deli na 5 i 7 : " + del);
		input.close();
	}

}
