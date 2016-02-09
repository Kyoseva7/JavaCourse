import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int n = input.nextInt();
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("vuvedete chislo na masiv 1");
			arr1[i] = input.nextInt();
		}
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("vuvedete chislo na masiv 2");
			arr2[i] = input.nextInt();
		}
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					continue;
				}
			}
		}
		input.close();

	}

}
