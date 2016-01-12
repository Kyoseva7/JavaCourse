package Zad105;

import java.util.Scanner;

public class Zad105 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Vuvedete zadacha: ");
		String zad = input.nextLine();
		trueOrFalse(zad);
		input.close();
	}

	public static boolean trueOrFalse(String zad) {
		int countO = 0;
		int countC = 0;
		int indexOpen = zad.indexOf("(");
		int indexClose = zad.indexOf(")");
		if (indexOpen > 0 && indexClose > 0) {
			if (indexOpen < indexClose) {
				for (; indexOpen >= 0; indexOpen++) {
					indexOpen = zad.indexOf("(", indexOpen + 1);
					countO++;
					for (; indexClose >= 0; indexClose++) {
						indexClose = zad.indexOf("(", indexClose + 1);
						countC++;
						if (indexOpen < indexClose) {
							continue;
						} else {
							return false;
						}
					}
					if (countO == countC) {
						return true;
					}
				}
			} else {
				return false;
			}
		}else if (indexOpen < 0 && indexClose < 0) {
			return true;
		} else {
			return false;
		}
		return false;
	}
}
