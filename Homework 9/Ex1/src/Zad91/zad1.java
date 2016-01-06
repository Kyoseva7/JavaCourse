package Zad91;

import java.util.ArrayList;
import java.util.Scanner;

public class zad1 {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();
		Scanner input = new Scanner(System.in);

		for (int i = 0; i <= 20; i++) {
			System.out.println("Vuvedete duma: ");
			words.add(input.nextLine());
		}

		for (int i = 0; i < words.size(); i++) {
			int count = 0;
			for (int j = 0; j < words.size(); j++) {
				if (words.get(i) == words.get(j)) {
					count++;
				}
			}
			System.out.println(words.get(i) + " : " + count);
		}
		input.close();
	}

}
