
public class Zad9 {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] arr2 = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
				arr2[j] = arr[i];
				System.out.print(arr2[j] + " ");
				j++;
		}
	}

}
