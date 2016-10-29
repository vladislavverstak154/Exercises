package students_task5;

public class Test {

	public static void main(String[] args) {
		
		Student.newStudent("Michel","Petya","Zhenya","Vanya","Kirill","Dima","Vlad","Inokentii");		
		Group.newGroup((Subject.ENGLISH),Student.getStudents(0,4));
		Group.newGroup((Subject.MATH),Student.getStudents(3,7));
		
		Group groupEnglish=Group.getGroup(Subject.ENGLISH);
		Group groupHistory=Group.getGroup(Subject.MATH);
		
		groupEnglish.setMark(Student.getStudent("Michel"), "3");
		groupEnglish.setMark(Student.getStudent("Petya"), "3");
		groupEnglish.setMark(Student.getStudent("Zhenya"), "3");
		groupEnglish.setMark(Student.getStudent("Vanya"), "3");
		groupEnglish.setMark(Student.getStudent("Kirill"), "3");
		
		groupHistory.setMark(Student.getStudent("Vanya"), "3");
		groupHistory.setMark(Student.getStudent("Kirill"), "3");
		groupHistory.setMark(Student.getStudent("Dima"), "3");
		groupHistory.setMark(Student.getStudent("Vlad"), "3");
		groupHistory.setMark(Student.getStudent("Inokentii"), "3");
		
		
		Group.getStudentInfo(Student.getStudent("Vanya"));
		Group.getStudentInfo(Student.getStudent("Vlad"));
		
		
	}

}
