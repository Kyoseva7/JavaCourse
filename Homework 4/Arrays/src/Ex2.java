import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete 16 chisla: ");
		int[][] matr = new int[4][4];
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr.length; j++) {
				matr[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr.length; j++) {
				if (matr[i][j] % 2 != 0) {
					matr[i][j] *=2;
				}
				System.out.print(matr[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
