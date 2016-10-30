package students_task5;

import java.util.ArrayList;

public class Student {
	private String name;
	private static ArrayList<Student> students = new ArrayList<Student>(1);

	public Student(String name) {
		this.name = name;
		Student.students.add(this);
	}

	public static Student[] getStudents(int i, int j) {
		int length = 0;
		if (i == 0) {
			length = j+1;
		} else {
			length = j - i + 1;
		}
		Student[] students = new Student[length];
		int counter=0;
		while (i <= j) {
			students[counter] = Student.students.get(i);
			counter++;
			i++;
		}
		return students;
	}

	public static Student getStudent(String name) {
		Student studentGet = null;
		for (Student student : Student.students) {
			if (student.getName().equals(name)) {
				studentGet = student;
			}
		}
		return studentGet;
	}

	public String getName() {
		return name;
	}

	public boolean equals(Student student) {
		
		if (this.getName().equals(student.getName())) {
			return true;
		} else {
			return false;
		}
	}

}
