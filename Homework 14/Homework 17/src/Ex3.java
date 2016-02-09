
public class Ex3 {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1, 4, 5, 12, 43, -5, -3, 7, 35, 36};
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				if(arr[i] > max) {
					max = arr[i];
				}
			} else {
				if(arr[i] < min) {
					min = arr[i];
				}
			}
		}
		
		System.out.println("min = " + min);
		System.out.println("max = " + max);
	}

}
