
public class SchoolTeacher extends Teacher {
	
	public SchoolTeacher() {
		super();
	}
	
	public SchoolTeacher(String name, String familyName, int workAge, String subject, String[] classes) {
		super(name, familyName, workAge, subject);
		setClasses(classes);
	}
	
	String[] classes = new String[5];
	
	public void setClasses(String[] arr) {
		this.classes = arr;
	}
	
	public void sayClasses() {
		for (int i = 0; i < classes.length; i++) {
			System.out.print(classes[i] + " ");
			System.out.println();
		}
	}
	
	public void enjoyKids() {
		System.out.println("enjoy classes");
	}
	
}
