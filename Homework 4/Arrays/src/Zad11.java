import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int a = 1;
		int n = input.nextInt();
		int[][] matr = new int[n][n];
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				matr[i][j] = a; 
				a++;
			}
		}
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				System.out.print(matr[i][j] + "\t");
			}
			System.out.println();
		}
		input.close();
	}

}
