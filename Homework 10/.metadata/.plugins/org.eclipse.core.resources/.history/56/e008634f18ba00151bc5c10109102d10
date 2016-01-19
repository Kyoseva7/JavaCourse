import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Zad107 {

	public static void main(String[] args) {
		readAndEdit("E:/JavaCourse/JavaCourse/JavaCourse/Homework 10/Zad107/Text.txt", "E:/JavaCourse/JavaCourse/JavaCourse/Homework 10/Zad107/Text1.txt", "E:/JavaCourse/JavaCourse/JavaCourse/Homework 10/Zad107/Text2.txt");

	}
	
	public static void readAndEdit(String path, String path2, String path3) {
		
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int count = 0;
			while (bufferedReader.ready()) {
				String line = bufferedReader.readLine();
				count++;
				if (count % 2 == 0) {
					try {

						FileWriter fileStream = new FileWriter(path2);

						BufferedWriter writer = new BufferedWriter(fileStream);

						writer.write(line.toString());
						writer.newLine();

						writer.close();

					} catch (Exception e) {
						System.out.println("Error while writing a file.");
						System.out.println(e.getMessage());
						System.exit(0);
						System.out.println(line);
					}
				} else {
					try {

						FileWriter fileStream = new FileWriter(path3);

						BufferedWriter writer = new BufferedWriter(fileStream);

						writer.write(line.toString());
						writer.newLine();

						writer.close();

					} catch (Exception e) {
						System.out.println("Error while writing a file.");
						System.out.println(e.getMessage());
						System.exit(0);
						System.out.println(line);
					}
					
				}
			}
			bufferedReader.close();
		} catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

}
