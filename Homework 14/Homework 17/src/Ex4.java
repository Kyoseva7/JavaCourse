import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] a = new int[]{3, 5, 6, 1, 7, 11};
		int[] b = new int[]{5, 12, 4, 2, 3, 6};
		 System.out.println("Vuvedete chislo: ");
		 int n = input.nextInt();
		 
		 for (int i = 1; i <= n; i++) {
			for (int j = 0; j < b.length; j++) {
				if(i % a[j] == 0 && i % b[j] != 0) {
					System.out.println(i);
				}
			}
		}
		 input.close();
	}

}
