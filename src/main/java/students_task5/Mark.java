package students_task5;


class Mark<T extends Number>{
	private Student owner;
	private T value;
	
	Mark(Student student, T value) {
		this.owner = student;
		this.value = value;
	}

	public Number getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Student getOwner() {
		return owner;
	}

	public int compareTo(Mark<T> mark) {
		if (this.value.doubleValue() < mark.value.doubleValue()) {
			return 1;
		} else{return 0;}
	}

}
	

