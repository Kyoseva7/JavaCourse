import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo: ");
		int num = input.nextInt();
		if (num < 0 && num > 999) {
			System.out.println("Greshno chislo");
		}
		String stot = "";
		String deset = "";
		String edin = "";
		if (num > 20) {
			int st = num / 100;
			switch (st) {
			case 0:
				break;
			case 1:
				stot = "one hundred";
				break;
			case 2:
				stot = "two hundred";
				break;
			case 3:
				stot = "three hundred";
				break;
			case 4:
				stot = "four hundred";
				break;
			case 5:
				stot = "five hundred";
				break;
			case 6:
				stot = "six hundred";
				break;
			case 7:
				stot = "seven hundred";
				break;
			case 8:
				stot = "eight hundred";
				break;
			case 9:
				stot = "nine hundred";
				break;
			}

			int ost = num % 100;
			if (ost < 20 && ost > 9) {
				switch (ost) {
				case 10:
					deset = "ten";
					break;
				case 11:
					deset = "eleven";
					break;
				case 12:
					deset = "twelve";
					break;
				case 13:
					deset = "thirtheen";
					break;
				case 14:
					deset = "fourteen";
					break;
				case 15:
					deset = "fiftheen";
					break;
				case 16:
					deset = "sixteen";
					break;
				case 17:
					deset = "seventeen";
					break;
				case 18:
					deset = "eighteen";
					break;
				case 19:
					deset = "nineteen";
					break;
				}
				System.out.println(stot + " " + deset);
			} else {
				int des = ost / 10;
				switch (des) {
				case 2:
					deset = "twenty";
					break;
				case 3:
					deset = "thirty";
					break;
				case 4:
					deset = "fourty";
					break;
				case 5:
					deset = "fifty";
					break;
				case 6:
					deset = "sixty";
					break;
				case 7:
					deset = "seventy";
					break;
				case 8:
					deset = "eighty";
					break;
				case 9:
					deset = "ninety";
					break;
				}
				int ed = ost % 10;
				switch (ed) {
				case 0:
					break;
				case 1:
					edin = "one";
					break;
				case 2:
					edin = "two";
					break;
				case 3:
					edin = "three";
					break;
				case 4:
					edin = "four";
					break;
				case 5:
					edin = "five";
					break;
				case 6:
					edin = "six";
					break;
				case 7:
					edin = "seven";
					break;
				case 8:
					edin = "eight";
					break;
				case 9:
					edin = "nine";
					break;
				}
				System.out.println(stot + " " + deset + " " + edin);
			}
		} else {
			switch (num) {
			case 10:
				break;
			case 11:
				System.out.println("eleven");
				break;
			case 12:
				System.out.println("twelve");
				break;
			case 13:
				System.out.println("thirteen");
				break;
			case 14:
				System.out.println("fourteen");
				break;
			case 15:
				System.out.println("fifteen");
				break;
			case 16:
				System.out.println("sixteen");
				break;
			case 17:
				System.out.println("seventeen");
				break;
			case 18:
				System.out.println("eighteen");
				break;
			case 19:
				System.out.println("nineteen");
				break;
			case 20:
				System.out.println("twenty");
				break;
			case 0:
				System.out.println("zero");
				break;
			}
		}
		input.close();
	}

}
