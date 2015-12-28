
public class Company {

	private String name;
	private int numOfEmpl;

	public Company() {
		super();
	}
	
	public Company(String name, int numOfEmpl) {
		super();
		this.name = name;
		this.numOfEmpl = numOfEmpl;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfEmpl() {
		return numOfEmpl;
	}

	public void setNumOfEmpl(int numOfEmpl) {
		this.numOfEmpl = numOfEmpl;
	}

}
