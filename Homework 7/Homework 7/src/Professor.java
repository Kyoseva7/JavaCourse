
public class Professor extends Lecturer {
	
	private String title;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Professor() {
		super();
	}
	
	public Professor(String name, String familyName, int workAge, String subject, String college, int lectures, String title) {
		super(name, familyName, workAge, subject, college, lectures);
		setTitle(title);
	}
	
	public void Say() {
		System.out.println("title: " + title);
		System.out.println("ages of work: " + workAge);
	}
	
	public void homework(int hw) {
		System.out.println(hw + "!");
	}
	
	public void makeExams(String exam) {
		System.out.println("Make exam in " + exam);
	}
}
