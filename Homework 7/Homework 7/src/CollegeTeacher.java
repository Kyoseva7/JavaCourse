
public class CollegeTeacher extends Teacher {
	
	private String college;
	
	public CollegeTeacher() {
		super();
	}
	
	public CollegeTeacher(String name, String familyName, int workAge, String subject, String college) {
		super(name, familyName, workAge, subject);
		setCollege(college);
	}
	
	public void setCollege (String college) {
		this.college = college;
	}
	
	public String getCollege() {
		return college;
	}
	
}
