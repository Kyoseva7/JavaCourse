
public class Test {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher("Ana", "Hana", 7, "literature");
		teacher1.goodDay();
		teacher1.goodBye();
		
		SchoolTeacher schoolTeacher1 = new SchoolTeacher("Ben", "Haris", 9, "math", new String[]{"3a", "1b", "4a", "4b", "1c"});
		schoolTeacher1.sayClasses();
		schoolTeacher1.enjoyKids();
		schoolTeacher1.homework(5);
		System.out.println();
		
		CollegeTeacher collTeach = new CollegeTeacher("Mia", "Vain", 1, "science", "SU");
		collTeach.homework(6);
		System.out.println();
		
		Lecturer lecturer1 = new Lecturer("Tom", "Lane", 8, "math", "Su", 4);
		lecturer1.exercise1();
		lecturer1.exercise2(3);
		lecturer1.exercise3(1, 3);
		lecturer1.homework(3);
		System.out.println();
		
		Professor professor1 = new Professor("Mike", "Moris", 2, "history", "TU", 5, "prof");
		professor1.Say();
		professor1.homework(3);
		professor1.makeExams("history");
		System.out.println();
		
		Assistant assist1 = new Assistant("Don", "Time", 2, "chemic", "TU", 6, true);
		assist1.Say();
		assist1.makeSciencePubl("chemic");
		assist1.homework(6);
		assist1.checkExams("chemic");
		System.out.println();
		
		System.out.println("Objects: " + Person.personCount);
		
	}

}
