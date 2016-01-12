import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Zad106 {

	public static void main(String[] args) {
		readAndCopy("E:/JavaCourse/JavaCourse/JavaCourse/Homework 10/Homework 10/src/Text.txt", "E:/JavaCourse/JavaCourse/JavaCourse/Homework 10/Homework 10/src/Text2.txt");
	}

	public static void readAndCopy(String path, String path2) {

		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
				String line = bufferedReader.readLine();
				try {

					FileWriter fileStream = new FileWriter(path2);

					BufferedWriter writer = new BufferedWriter(fileStream);

					writer.write(line.split(" |, |! |?").toString());
					writer.newLine();

					writer.close();

				} catch (Exception e) {
					System.out.println("Error while writing a file.");
					System.out.println(e.getMessage());
					System.exit(0);
					System.out.println(line);
				}
				bufferedReader.close();
			}
		} catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

}
