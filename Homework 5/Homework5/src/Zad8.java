
public class Zad8 {

	public static void main(String[] args) {
		int n = 3;
		perm(n);
	}
	public static void perm(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		if (n == 1) {
			System.out.println(arr);
		} else {
			for (int i = 0; i < n; i++) {
				int tmp = 0;
				arr[i] = tmp;
				arr[i] = arr[n - 1];
				arr[n - 1] = tmp;
				System.out.println(arr);
				perm(n-1);
				arr[i] = tmp;
				arr[i] = arr[n - 2];
				arr[n - 2] = tmp;
				System.out.println(arr);
			}
		}
	}
}
