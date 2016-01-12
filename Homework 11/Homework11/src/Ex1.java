import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete duma: ");
		String word = input.nextLine();
		
		Stack<Character> small = new Stack<Character>();
		Queue<Character> big = new LinkedList<Character>();
		for (int i = 0; i < word.length(); i++) {
			Character letter = word.charAt(i);
			if(letter.equals(letter.toUpperCase(letter))) {
				small.push(letter);
			} else {
				big.offer(letter);
			}
		}
		while(!small.isEmpty()) {
			Character current = small.pop();
			System.out.print(current);
		}
		System.out.println();
		
		while(!big.isEmpty()) {
			Character current = big.poll();
			System.out.print(current);
		}
		input.close();
	}

}
