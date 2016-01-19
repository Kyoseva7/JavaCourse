package Zad93;

import java.util.HashMap;
import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {

		HashMap<String, Integer> cards = new HashMap<String, Integer>();
		Scanner input = new Scanner(System.in);

		for (int i = 0;; i++) {
			System.out.println("Vuvedete kartite edna po edna: ");
			String card = input.nextLine();
			switch (card) {
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "10":
			case "J":
			case "Q":
			case "K":
			case "A":
				if (cards.containsKey(card)) {
					Integer count = cards.get(card);
					cards.put(card, count++);
				} else {
					cards.put(card, 1);
				}
				break;
			}
			if (cards.size() == 5) {
				break;
			}
		}

		if (cards.containsValue(4)) {
			System.out.println("kare");
		} else if (cards.containsValue(3)) {
			System.out.println("set");
		} else if (cards.containsValue(2)) {
			System.out.println("chift");
		}
		input.close();

	}

}
