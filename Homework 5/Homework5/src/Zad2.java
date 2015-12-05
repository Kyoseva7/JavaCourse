import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete ime: ");
		String name = input.nextLine();
		helloYou(name);
		input.close();
	}
	public static void helloYou(String n) {
		System.out.println("Hello " + n);
	}
}
