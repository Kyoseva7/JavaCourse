import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Vuvedete izrechenie duma po duma: ");
		
		Queue<String> words = new LinkedList<String>();
		for (int i = 0; i < 6; i++) {
			String word = input.nextLine();
			if (word.length() >= 3) {
				words.offer(input.nextLine());
			}
		}
		
		while(!words.isEmpty()) {
			String current = words.poll();
			System.out.print(current + " ");
		}
		input.close();

	}

}
