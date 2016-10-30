package students_task5;

import java.util.ArrayList;

public class Group {
	private static ArrayList<Group> groups = new ArrayList<>(1);
	private ArrayList<Student> students = new ArrayList<>(1);
	private ArrayList<Mark<Number>> marks = new ArrayList<>(1);
	private Subject subject;

	// private constructor to allow create new groups only by invoking method
	// newGroup
	public Group(Subject subject, Student... students) {
		this.subject = subject;
		for (Student student : students) {
			this.students.add(student);
		}
		Group.groups.add(this);
	}

	// if Integer returns true, pivate method is made for cheking discipline
	private boolean typeCheker() {
		if (this.subject.equals(Subject.ENGLISH) || this.subject.equals(Subject.HISTORY)) {
			return true;
		} else {
			return false;
		}
	}

	// Methods for set marks for students

	/**
	 * This parameter sets a mark for student in subject
	 * 
	 * @param student
	 *            reference for particular student
	 * @param mark
	 *            the value for mark in String type
	 */
	public void setMarks(Student[] students, String[] marks) {
		if (this.typeCheker()) {
			for (int i = 0; i < students.length; i++) {
				this.<Integer>setMark(students[i], (Integer) Integer.parseInt(marks[i]));
			}

		} else {
			for (int i = 0; i < students.length; i++) {
				this.<Double>setMark(students[i], (Double) Double.parseDouble(marks[i]));
			}
		}
	}

	public <T extends Number> void setMark(Student student, T value) {
		Mark<Number> mark = new Mark<>(student, value);
		this.marks.add(mark);
	}

	// Methods to get marks according to students and to compare marks

	public Mark<Number> getMark(Student student) {
		Mark<Number> mark = null;
		for (Mark<Number> markEach : this.marks) {
			if (markEach.getOwner().equals(student)) {
				mark = markEach;
			}
		}
		return mark;
	}

	public int getMarkRank(Mark<Number> mark) {
		int counter = 0;
		for (Mark<Number> markEach : this.marks) {
			counter = counter + mark.compareTo(markEach);
		}
		return counter;
	}

	// Methods to get info about groups where student is;

	public static void getStudentInfo(Student student) {
		System.out.println("Info about " + student.getName());
		for (Group group : Group.groups) {
			for (Student studentEach : group.students) {
				if (studentEach != null) {
					if (student.equals(studentEach)) {
						System.out.println(group.subject.toString() + " subject mark is "
								+ group.getMark(student).getValue().doubleValue() + " and rank" + " is "
								+ group.getMarkRank(group.getMark(student)));
					}
				}
			}
		}
	}

}