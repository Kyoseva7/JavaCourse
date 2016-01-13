import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Zad3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Stack<Character> numbers = new Stack<Character>();
		Queue<Character> symbols = new LinkedList<Character>();
		String zad = input.nextLine();
		if (checkIfNum(zad.charAt(0))) {
			for (int i = 1; i < zad.length(); i++) {
				if(zad.charAt(i) % 2 == 0) {
					if(checkIfNum(zad.charAt(i))) {
						numbers.push(zad.charAt(i));
					}
				} else {
					if (zad.charAt(i) == '+' || zad.charAt(i) == '-') {
						symbols.offer(zad.charAt(i));
					}
				} 
			}
		} else {
			System.out.println("nekorektno!");
		}
		
		while(!numbers.isEmpty() && !symbols.isEmpty()) {
			Character current = numbers.pop();
			Character current2 = symbols.poll();
			System.out.printf("%d %s\n", current, current2);
		}
		input.close();
	}
	
	public static boolean checkIfNum(char a) {
		switch (a) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				return true;
			default:
				return false;
		}
	}
}
