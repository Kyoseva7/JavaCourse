
public class Zad8 {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 5, 7, 8, 7, 5, 1};
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == arr[j]) {
				j++;
				if (i == arr.length / 2 + 1){
					System.out.println("Masivut e simetrichen");
				}
			} else {
				System.out.println("Masivut e nesimetrichen");
				break;
			}
		}
	}

}
