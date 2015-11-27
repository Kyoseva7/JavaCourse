import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete ime: ");
		String name = input.nextLine();
		System.out.println("Vuvedete familiq: ");
		String surename = input.nextLine();
		System.out.println("Vuvedete godini: ");
		byte age = input.nextByte();
		System.out.println("Vuvedete pol: ");
		char sex = input.next().charAt(0);
		System.out.println("Vuvedete EGN: ");
		long egn = input.nextLong();
		System.out.println("Vuvedete telefon: ");
		long gsm = input.nextLong();
		System.out.println("Ime: " + name);
		System.out.println("Familiq: " + surename);
		System.out.println("Godini: " + age);
		System.out.println("Pol: " + sex);
		System.out.println("EGN: " + egn);
		System.out.println("telefon: " + gsm);
		input.close();
	}

}
