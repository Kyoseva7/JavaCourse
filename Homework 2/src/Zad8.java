import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int a = input.nextInt();
		boolean chetno = a % 2 == 0;
		boolean nechetno = a % 2 != 0;
		System.out.println("chetno : " + chetno);
		System.out.println("nechetno : " + nechetno);
		input.close();
	}

}
