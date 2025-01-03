package listObjectConstructor;

public class Subject {
	String name;
	int days;

	public Subject(String name, int days) {
		super();
		this.name = name;
		this.days = days;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + ", days=" + days + "]";
	}

}
