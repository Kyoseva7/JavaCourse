package Zad95;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<Town> towns = new HashSet<Town>();
		Town pleven = new Town("Pleven", "Bulgaria", 30300);
		Town varna = new Town("Varna", "Bulgaria", 330000);
		Town viena = new Town("Viena", "Austria", 150045);
		Town Nikolpol = new Town("Nikopol", "Bulgaria", 15000);
		Town Milano = new Town("Milano", "Italy", 560560);
		
		System.out.println(towns);
		
		System.out.println(towns.contains("Varna"));
		
		towns.remove(varna);
		
		System.out.println(towns);
	}

}
