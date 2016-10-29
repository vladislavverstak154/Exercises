package students_task5;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
	private static Group[] groups=new Group[1];
	private Student[] students=new Student[1];
	private Mark[] marks=new Mark[1];
	private Subject subject;
	private static int groupcount;
	
	
	//this method returns a group according to it's subject
	
	public static Group getGroup(Subject subject){
		int i = 0;
		while (i < Group.groups.length && !Group.groups[i].subject.equals(subject)) {
			i++;
		}
		if (Group.groups[Group.groups.length - 1].subject.equals(subject)) {
			return Group.groups[i];
		} else if (i < Group.groups.length - 1) {
			return Group.groups[i];
		}
		return null;
	}
	
	public static void getStudentInfo(Student student) {
		int i = 0;
		System.out.println(student.getName());
		while (i < 3) {
			int j = 0;
			while (j < groups[i].students.length) {
				if (groups[i].students[j].getName().equals(student.getName())) {
					System.out.println(student.getName());
					System.out.println(groups[i].subject.toString() + " mark is "
							+ groups[i].getMark(student).getValue() + "and rank is " + groups[i].getRank(student));
				}
			}
			i++;
		}
	}

	/**
	 * Returns a rank of student which depends on his mark
	 * 
	 * @param student
	 * @return int returns place of student by value of his mark
	 */
	public int getRank(Student student) {
		this.sortMarks();
		int i = this.getMarkRank(this.getMark(student));
		return i;
	}

	// this method sort marks, to get it's value
	private void sortMarks() {
		Arrays.sort(this.marks);
	}

	private int getMarkRank(Mark mark) {
		int i = 0;
		while (i < this.marks.length && !this.marks[i].getValue().equals(mark.getValue())) {
			i++;
		}
		return i;
	}
	
	private Mark getMark(Student student) {
		int i = 0;
		while (i < this.marks.length && !this.marks[i].getOwner().equals(student.getName())) {
			i++;
		}
		if (this.marks[this.marks.length - 1].getOwner().equals(student.getName())) {
			return this.marks[i];
		} else if (i < this.marks.length - 1) {
			return this.marks[i];
		}
		return null;
	}

	// private constructor to allow create new groups only by invoking method
	// newGroup
	private Group(Subject subject, Student... students) {
		this.subject = subject;
		this.students = students;
}

	/**
	 * This method creates a new Group and places reference for it in Static
	 * field groups;
	 * 
	 * @param subject
	 *            specifies the subject of group;
	 * @param students
	 *            specifies the array or a student;
	 */
	public static void newGroup(Subject subject, Student... students) {
		if (groupcount < 4) {
			int j=groups.length;
			groups[groupcount] = new Group(subject, students);
			groupcount++;
		} else {
			System.out.println("The group limit is reached");
		}
	}

	/**
	 * This method add's a Student to group
	 * 
	 * @param student
	 *            reference for a particular Student
	 */
	public void addStudent(Student... student) {
		for (int i = 0; student.length < i; i++) {
			this.students = this.addOne(this.students, student[i]);
		}
	}

	// if Integer returns true, pivate method is made for cheking discipline
	private boolean typeCheker() {
		if (this.subject.equals(Subject.ENGLISH) || this.subject.equals(Subject.HISTORY)) {
			return true;
		} else {
			return false;
		}
	}

	// this method returns the owner of mark
	private Student getOwner(Mark mark) {
		if (this.typeCheker()) {
			Mark markM = mark;
			return markM.getOwner();
		} else {
			Mark markM = mark;
			return markM.getOwner();
		}
	}

	/**
	 * This parameter sets a mark for student in subject
	 * 
	 * @param student
	 *            reference for particular student
	 * @param mark
	 *            the value for mark in String type
	 */
	public void setMark(Student student, String mark) {
		if (this.typeCheker()) {
			this.addOne(this.marks, new Mark(student, Integer.parseInt(mark)));
		} else {
			this.addOne(this.marks, new Mark(student, Double.parseDouble(mark)));
		}

	}
	
	//This method is made to add one object to array of objects

	private <T> T[] addOne(T[] array, T one) {
		boolean write = false;
		for (int i = 0; i < array.length & !write; i++) {
			if (array[i] == null) {
				array[i] = one;
				write = true;
			} else
				;
		}
		if (!write) {
			Object[] arrayM = (Object[]) array;
			Object[] arrayNew = new Object[arrayM.length + 1];
			System.arraycopy(arrayM, 0, arrayNew, 0, array.length);
			System.arraycopy(array, 0, arrayNew, 0, array.length);
			array = (T[]) arrayNew;
			array[array.length - 1] = one;
		}
		return array;
	}

	// Помещена внутри т.к. оценка не может существовать без самой группы

	class Mark implements Comparable<Mark> {
		private Student owner;
		private Number value;
		
		Mark(){super();};

		Mark(Student student, Number value) {
			this.owner = student;
			this.value = value;
		}

		public Number getValue() {
			return value;
		}

		public void setValue(Number value) {
			this.value = value;
		}

		public Student getOwner() {
			return owner;
		}

		public int compareTo(Mark mark) {
			if (this.value.doubleValue() < mark.value.doubleValue()) {
				return -1;
			} else if (this.value.doubleValue() == mark.value.doubleValue()) {
				return 0;
			}
			return 1;
		}

	}
}