import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo ot 2 do 9 : ");
		int num = input.nextInt();
		if (num > 1 && num < 10) {
			Matrix matrix = new Matrix(num);

			System.out.println("Vuvedete stoinostite na matricata: ");
			int[][] array = new int[num][num];
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = input.nextInt();
				}
			}
			matrix.fillArray(array);
			
				int enter = 0;
			do {
				System.out.println("Vuvedete 1 za da zapishete masiva vuv fail.");
				System.out.println(
						"Vuvedete 2 za da namerite sumata ot nai-golemite chisla na vseki red, kolona i diagonali.");
				System.out.println("Vuvedete 3 za izhod.");
				enter = input.nextInt();
				if (enter == 1) {
					matrix.writeArray();
				} else if (enter == 2) {
					System.out.println(matrix.sumOfMax());
				}
			} while (enter != 3);

		} else {
			System.out.println("Try again!");
		}

		input.close();

	}

}
