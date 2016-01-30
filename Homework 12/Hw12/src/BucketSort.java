import java.util.Arrays;

public class BucketSort {
	
	 public static void bucketSort(int[] arr, int max) {
	      int[] bucket = new int[max + 1];
	 
	      for (int i = 0; i < bucket.length; i++) {
	         bucket[i] = 0;
	      }
	 
	      for (int i = 0; i < arr.length; i++) {
	         bucket[arr[i]]++;
	      }
	 
	      int outPos = 0;
	      for (int i = 0; i < bucket.length; i++) {
	         for (int j = 0; j < bucket[i]; j++) {
	            arr[outPos++]=i;
	         }
	      }
	   }
	 
	 public static void main(String[] Args) {
		 int[] array = new int[] {5, 1, 8, 0, 4, 6, 3};
		 System.out.println("Before sorting: " + Arrays.toString(array));
		 bucketSort(array, 8);
		 System.out.println("After sorting" + Arrays.toString(array));
	 }
}
