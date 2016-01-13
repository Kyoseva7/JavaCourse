import java.util.Scanner;
import java.util.Stack;

public class Zad1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Vuvedete izrechenie duma po duma: ");
		
		Stack<String> words = new Stack<String>();
		for (int i = 0; i < 6; i++) {
			words.push(input.nextLine());
		}
		
		while(!words.isEmpty()) {
			String current = words.pop();
			System.out.print(current + " ");
		}
		input.close();
	}

}
