import java.util.Scanner;

public class Cat {
	
	String name;
	int age;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete imenata i godinite na vsqka kotka(purvo ime, posle godini): ");
		Cat[] cats = new Cat[10];
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Cat();
			cats[i].name = input.nextLine();
			cats[i].age = input.nextInt();
		}
		
		for (int i = 0; i < cats.length; i++) {
			cats[i].Say();
		}
		input.close();
	}
	
	public void Say() {
		System.out.println("name is: " + name);
		System.out.println("age is " + age);
	}
}
