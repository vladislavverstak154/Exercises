package students_task5;

public class Group {
	private Student[] students;
	private Mark<T>[] marks;
	private Subject subject;

	public Group(Subject subject, Student... students) {
		this.subject = subject;
		this.students = students;
	}
	
	public <T> void addMark(Mark<T> mark){
		
	}

	public void setMark(Student student, String mark) {
		if (this.subject.toString().equals("ENGLISH")) {
			this.addMark(new Mark<Integer>(student, Integer.parseInt(mark)));
		}
	}

	// Помещена внутри т.к. оценка не может существовать без самой группы

	class Mark<T> {
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

	}
}