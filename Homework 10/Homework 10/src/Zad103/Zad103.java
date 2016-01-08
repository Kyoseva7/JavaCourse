package Zad103;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Zad103 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete duma: ");
		String word = input.nextLine();
		System.out.println("Vuvedete izrechenie: ");
		String sentence = input.nextLine();

		int count = 0;
		int index = sentence.indexOf(word);
		
		for (; index >= 0; index++) {
			index = sentence.indexOf(word, index + 1);
			count++;
		}

		System.out.println(count);
		input.close();
	}

}
