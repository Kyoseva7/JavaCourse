
public class Assistant extends Lecturer {
	
	public Assistant() {
		super();
	}
	
	public Assistant(String name, String familyName, int workAge, String subject, String college, int lectures, boolean mainOrNot) {
		super(name, familyName, workAge, subject, college, lectures);
		setMainOrNot(mainOrNot);
	}
	
	private boolean mainOrNot;

	public boolean getMainOrNot() {
		return mainOrNot;
	}

	public void setMainOrNot(boolean mainOrNot) {
		this.mainOrNot = mainOrNot;
	}
	
	public void Say() {
		System.out.println("name: " + name);
		System.out.println("main or not: " + mainOrNot);
	}
	
	public void makeSciencePubl(String publ) {
		System.out.println(publ);
	}
	
	public void homework(int hw) {
		System.out.println(hw + "!!");
	}
	
	public void checkExams(String exam) {
		System.out.println("Check exam in " + exam);
	}
}
