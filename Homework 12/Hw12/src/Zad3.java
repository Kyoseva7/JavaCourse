
import java.util.Scanner;
import java.util.TreeSet;

public class Zad3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		TreeSet<String> sentence = new TreeSet<String>();
		System.out.println("Vuvedete izrechenieto duma po duma: ");
		sentence.add(input.nextLine());
		
		while(!sentence.isEmpty()) {
			String word = sentence.first();
			System.out.print(word + " ");
			sentence.remove(word);
		}	
		input.close();
	}

}
