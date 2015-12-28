
public abstract class Person {
	
	public Person() {
		super();
	}
	
	public Person(String name, String familyName, int workAge) {
		super();
		personCount++;
	}
	
	public static int personCount = 0;
	protected String name;
	protected String familyName;
	protected int workAge = 0;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	public int getWorkAge() {
		return workAge;
	}

	public void setWorkAge(int workAge) {
		if(workAge > 0)
		this.workAge = workAge;
	}
	
	public void homework(int hw) {
		System.out.println(hw);
	}
	
	public void goodDay() {
		System.out.println("Good Day!");
	}

}
