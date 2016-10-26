package students_task5;

import java.util.Comparator;

public class Group {
	private static Group[] groups;
	private Student[] students;
	private Object[] marks;
	private Subject subject;

	private static int groupcount;
	
	private static int studentRank(){
		return 0;
	};
	
	
	
	private int getRank(Student student){
		int i=0;
		while(i<groups.length&&!subject.equals(groups[i])){
			i++;
		}
		int j=0;
		if(groups[i].equals(subject)){
			while(groups[i].getOwner(marks[j]).equals(student)){
				j++;
			}
		}
	};
	
	public void getStudentInfo(Student student){
		for()
	}

	private Group(Subject subject, Student... students) {
		this.subject = subject;
		this.students = students;
	}

	public static void newGroup(Subject subject, Student... students) {
		if (groupcount < 2) {
			groups[groupcount] = new Group(subject, students);
			groupcount++;
		} else {
			System.out.println("The group limit is reached");
		}
	}

	// Добавление любого количества студентов
	public void addStudent(Student... student) {
		for (int i = 0; student.length < i; i++) {
			addStudent(student[i]);
		}
	}

	// добавление одного студента
	private void addStudent(Student student) {
		boolean write = false;

		for (int i = 0; i < this.students.length & !write; i++) {
			if (this.students[i] == null) {
				this.students[i] = student;
				write = true;
			} else
				;
		}

		if (!write) {
			Student[] studentsNew = new Student[this.students.length + 1];
			System.arraycopy(this.students, 0, studentsNew, 0, this.students.length);
			this.students = studentsNew;
			System.out.println(this.students.length);
			this.students[this.students.length - 1] = student;

		}

	}
	
	private Student getOwner(Object mark){
		if (this.subject.toString().equals("ENGLISH") || this.subject.toString().equals("HISTORY")) {
			Mark<Integer> markM=(Mark<Integer>)mark;
			return markM.getOwner();
		} else {
			Mark<Double> markM=(Mark<Double>)mark;
			return markM.getOwner();
		}
		
	}

	public void addMark(Object mark) {
		boolean write = false;

		for (int i = 0; i < this.marks.length & !write; i++) {
			if (this.marks[i] == null) {
				this.marks[i] = mark;
				write = true;
			} else
				;
		}

		if (!write) {
			Object[] marksNew = new Object[this.marks.length + 1];
			System.arraycopy(this.marks, 0, marksNew, 0, this.marks.length);
			this.marks = marksNew;
			System.out.println(this.marks.length);
			this.marks[this.marks.length - 1] = mark;

		}
	}

	public void setMark(Student student, String mark) {
		if (this.subject.toString().equals("ENGLISH") || this.subject.toString().equals("HISTORY")) {
			this.addMark(new Mark<Integer>(student, Integer.parseInt(mark)));
		} else {
			this.addMark(new Mark<Double>(student, Double.parseDouble(mark)));
		}
	}

	// Помещена внутри т.к. оценка не может существовать без самой группы

	class Mark<T> implements Comparator<Mark<T>> {
		private Student owner;
		private T value;

		Mark(Student student, T value) {
			this.owner = student;
			this.value = value;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Student getOwner() {
			return owner;
		}

		public int compare(Mark<T> o1, Mark<T> o2) {
			this.getValue().
		}
		
		

	}
}