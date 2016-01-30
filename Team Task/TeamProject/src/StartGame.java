import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class StartGame {

	public static void main(String[] args) {

		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Integer> winNumbers = new ArrayList<Integer>();
		HashMap<Long, Integer> winners = new HashMap<Long, Integer>();
		Scanner input = new Scanner(System.in);
		do {

			System.out.println("Vuvedete 1 za dobavqne na igrach");
			System.out.println("Vuvedete 2 za izteglqne na pechelivshite chisla");
			System.out.println("Vuvedete 3 za pokazvane na pechelivshite igrachi");
			int action = input.nextInt();

			if (action == 1) {
				System.out.println("Please enter EGN");

				int egn = input.nextInt();
				ArrayList<Integer> numbers = new ArrayList<Integer>();

				for (; numbers.size() < 5;) {
					System.out.println("Please number");
					int number = input.nextInt();
					if (number > 30 || number < 1) {
						System.out.println("Wrong number!");
						continue;
					}
					numbers.add(number);

				}

				Player player = new Player(egn, numbers);
				players.add(player);
				continue;

			} else if (action == 2) {

				String filePath = "E:/JavaCourse/JavaCourse/JavaCourse/Team Task/ Players.txt";

				try {

					FileWriter fileStream = new FileWriter(filePath);

					BufferedWriter writer = new BufferedWriter(fileStream);

					for (int i = 0; i < players.size(); i++) {
						String play = (players.get(i).getEgn() + " : " + players.get(i).getNumbers());
						writer.write(play.toString());
						writer.newLine();
					}
					System.out.println();

					writer.close();

				} catch (Exception e) {
					System.out.println("Error while writing a file.");
					System.out.println(e.getMessage());
					System.exit(0);
				}

				System.out.println("The file is success.");

				for (int i = 0; i <= 5; i++) {
//					winNumbers.add(i + 1); debug
					Random rand = new Random();
					int randomInt = rand.nextInt(30);
					System.out.println(randomInt);
					winNumbers.add(randomInt);
				}
				printWinNumbers(winNumbers);

				String filePath1 = "E:/JavaCourse/JavaCourse/JavaCourse/Team Task/ Winning Numbers.txt";

				try {

					FileWriter fileStream = new FileWriter(filePath1);

					BufferedWriter writer = new BufferedWriter(fileStream);

					for (int i = 0; i < winNumbers.size(); i++) {
						writer.write(winNumbers.get(i).toString());
						writer.newLine();
					}
					System.out.println();

					writer.close();

				} catch (Exception e) {
					System.out.println("Error while writing a file.");
					System.out.println(e.getMessage());
					System.exit(0);
				}

				System.out.println("The file is success.");

			} else if (action == 3) {

				for (int i = 0; i < players.size(); i++) {
					int counter = 0;
					for (int j = 0; j < players.get(i).getNumbers().size(); j++) {
						if (winNumbers.contains(players.get(i).getNumbers().get(j))) {
							counter++;
						}
					}
					if (counter > 2) {
						winners.put(players.get(i).getEgn(), counter);
					}
				}

				String filePath = "E:/JavaCourse/JavaCourse/JavaCourse/Team Task/ Winners.txt";

				try {

					FileWriter fileStream = new FileWriter(filePath);

					BufferedWriter writer = new BufferedWriter(fileStream);

					for (Long key : winners.keySet()) {
						String winner = key + " : " + winners.get(key);
						writer.write(winner);
						writer.newLine();
					}
					System.out.println();

					writer.close();

				} catch (Exception e) {
					System.out.println("Error while writing a file.");
					System.out.println(e.getMessage());
					System.exit(0);
				}

				System.out.println("The file is success.");
				break;

			} else {
				break;
			}

		} while (true);
		input.close();

	}

	private static void printWinNumbers(ArrayList<Integer> winNumbers) {
		for (int i = 0; i < winNumbers.size(); i++) {
			System.out.print(winNumbers.get(i) + " ");
		}
		System.out.println();
	}

}
