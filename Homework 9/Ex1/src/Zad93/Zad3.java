package Zad93;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		
		ArrayList<String> cards = new ArrayList<String>();
		Scanner input = new Scanner(System.in);

		for (int i = 0; ; i++) {
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
					cards.add(card);
					break;
			}
			if (cards.size() == 5) {
				break;
			}
		}
		
		int count = 0;
		for (int i = 0; i < cards.size(); i++) {
			for (int j = 0; j < cards.size(); j++) {
				if (cards.get(i) == cards.get(j)) {
					count++;
				}
			}
		}
		
		if (count == 2) {
			System.out.println("Chift");
		} else if(count == 3) {
			System.out.println("Set");
		} else if (count == 4) {
			System.out.println("Kare");
		}
		input.close();

	}

}
