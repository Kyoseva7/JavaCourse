import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a card of the playing cards: ");
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
			System.out.println("Valid card");
			break;
		default:
			System.out.println(card + " " + "Is not a valid card");
		}
		input.close();
	}

}
