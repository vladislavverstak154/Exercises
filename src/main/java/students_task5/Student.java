package students_task5;

public class Student {
	private final String name;
	private static Student[] students;

	private Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static Student getStudent(String name) {
		int i = 0;
		while (i < students.length&&!students[i].getName().equals(name)  ) {
			i++;
		}
		if (students[i].getName().equals(name)) {
			return students[i];
		} else {
			return null;
		}
	}

	public static void newStudent(String... names) {
		for (int i = 0; i < names.length; i++) {
			Student student = new Student(names[i]);
			addStudent(student);
		}
	}

	// добавление одного студента
	private static void addStudent(Student student) {
		boolean write = false;

		for (int i = 0; i < students.length & !write; i++) {
			if (students[i] == null) {
				students[i] = student;
				write = true;
			} else
				;
		}

		if (!write) {
			Student[] studentsNew = new Student[students.length + 1];
			System.arraycopy(students, 0, studentsNew, 0, students.length);
			students = studentsNew;
			System.out.println(students.length);
			students[students.length - 1] = student;

		}

	}
}
