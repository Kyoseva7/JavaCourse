import java.util.Arrays;
import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] odd = new int[5];
		int count1 = 0;
		int count2 = 0;
		int[] even = new int[5];
		System.out.println("Vuvedete 10 chisla: ");
		for (int i = 0; i < 10; i++) {
			int number = input.nextInt();
			if (number % 2 == 0) {
				odd[count1] = number;		
				count1++;
			} else {
				even[count2] = number;
				count2++;
			}
		}
		Arrays.sort(even);
		Arrays.sort(odd);
		for (int i = 0; i < even.length; i++) {
			System.out.print(even[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < odd.length; i++) {
			System.out.print(odd[i] + " ");
		}
	}

}
