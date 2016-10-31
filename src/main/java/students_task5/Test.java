package students_task5;

public class Test {

	public static void main(String[] args) {

		String[] names = { "Michel", "Petya", "Zhenya", "Vanya", "Kirill", "Dima", "Vlad", "Inokentii", "Alesha",
				"Roger" };

		// creating students
		for (String name : names) {
			new Student(name);
		}

		// creating groups

		Group groupEnglish = new Group(Subject.ENGLISH, Student.getStudents(0, 6));
		Group groupHistory = new Group(Subject.HISTORY, Student.getStudents(3, 9));
		Group groupPhysics = new Group(Subject.PHYSICS, Student.getStudents(1, 5));
		Group groupMath = new Group(Subject.MATH, Student.getStudents(3, 9));
		
		String[] englishMarks={"3","2","4","5","6","7","5"};
		groupEnglish.setMarks(Student.getStudents(0, 6), englishMarks);
		
		String[] historyMarks={"6","2","5","6","7","2","5"};
		groupHistory.setMarks(Student.getStudents(3, 9), historyMarks);
		
		String[] physicsMarks={"3.2","9.2","2.3","3.6","8.7"};
		groupPhysics.setMarks(Student.getStudents(1, 5), physicsMarks);
		
		String[] mathMarks={"9.1","6.5","9.2","1.3","3.3","8.2","3.2"};
		groupMath.setMarks(Student.getStudents(3, 9), mathMarks);
		
		Group.getStudentInfo(Student.getStudent("Vlad"));
		
		
	}
}
