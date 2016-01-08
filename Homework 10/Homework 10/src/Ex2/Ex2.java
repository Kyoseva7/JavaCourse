package Ex2;

public class Ex2 {

	public static void main(String[] args) {
		String sentence = "Greetings from my home! Do you want some water?";
		boolean startsWith = sentence.startsWith("Greeting");
		System.out.format("The sentence begins with the word \"Greetings\": %s \n", startsWith);
		
		boolean endsWith = sentence.endsWith(".");
		System.out.format("The sentence ends with \".\" : %s \n", endsWith);
		
		boolean contains = sentence.contains("water");
		System.out.format("The sentence contains the word \"Water\" : %s \n", contains);
	}

}
