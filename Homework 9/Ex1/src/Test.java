import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList<Company> companies = new ArrayList<Company>();

		companies.add(new Company("Amber", 32));
		companies.add(new Company("Beep", 12));
		companies.add(new Company("Street", 21));

		Company tmp = new Company("New", 0);
		int temp = 0;

		for (int i = 0; i < companies.size(); i++) {
			if (tmp.getNumOfEmpl() < (companies.get(i)).getNumOfEmpl()) {
				tmp = companies.get(i);
				temp = i;
			}
		}

		companies.remove(tmp);

		Company company4 = new Company("Time", 32);
		Company company5 = new Company("Name", 44);
		Company company6 = new Company("Beer", 1);

		companies.add(company4);
		companies.add(company5);

		companies.set(0, company6);
		
		for (int i = 0; i < companies.size(); i++) {
			System.out.println(companies.get(i).getName());
		}
	}

}
