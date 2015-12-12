
public class Teacher extends Person {
	
	private String subject;
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public Teacher() {
		super();
	}
	
	public Teacher(String name, String familyName, int workAge, String subject) {
		super(name, familyName, workAge);
		setSubject(subject);
	}
	
	public void homework(int hw) {
		System.out.println(hw);
	}
	
	public void goodDay() {
		System.out.println("Good Day!");
	}
	
	public void goodBye() {
		System.out.println("Good Bye!");
	}
}
