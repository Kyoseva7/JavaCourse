
public class Zad5 {

	public static void main(String[] args) {
	
		simetricOrNot();
	}
	
	public static void simetricOrNot() {
		int k = 10;
		while (k < 1000) {
			int stot = k / 100;
			int ost = k % 100;
			int des = ost / 10;
			int ed = ost % 10;
			if (stot != 0) {
				if (stot == ed) {
					System.out.println(k + " is simetric");
				} 
			} else {
				if (des == ed) {
					System.out.println(k + " is simetric");
				} 
			}				
				k++;
		}
	}
}
