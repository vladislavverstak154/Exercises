package students_task5;

public class Mark<T extends Number> {
	private Student owner;
	private Subject group;
	private T value;
	public Student getOwner() {
		return owner;
	}
	public void setOwner(Student owner) {
		this.owner = owner;
	}
	public Subject getGroup() {
		return group;
	}
	public void setGroup(Subject group) {
		this.group = group;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	
}

