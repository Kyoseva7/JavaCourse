package Zad91;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {

		HashMap<String, Integer> words = new HashMap<String, Integer>();
		Scanner input = new Scanner(System.in);

		for (int i = 0; i <= 20; i++) {
			System.out.println("Vuvedete duma: ");
			String word = input.nextLine();
			if (words.containsKey(word)) {
				Integer count = words.get(word);
				words.put(word, count++);
			} else {
				words.put(word, 1);
			}
		}
		for(Entry<String, Integer> e: words.entrySet()) {
			e.getKey();
			e.getValue();
		}
		input.close();
	}

}
