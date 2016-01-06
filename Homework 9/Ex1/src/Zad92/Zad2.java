package Zad92;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		Scanner input = new Scanner(System.in);

		for (int i = 0; i <= 20; i++) {
			System.out.println("Vuvedete teksta duma po duma: ");
			words.add(input.nextLine());
		}

		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.size(); j++) {
				if (words.get(i) != words.get(j)) {
					if(j == 0) {
						System.out.println(words.get(i));
					}
				}
			}
		}
		input.close();

	}

}
