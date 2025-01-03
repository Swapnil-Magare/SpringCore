package listConstructor;

import java.util.List;

public class Student {
	private String name;
	private int sid;
	private List<String> subjects;

	public Student() {

	}

	public Student(String name, int sid, List<String> subjects) {

		this.name = name;
		this.sid = sid;
		this.subjects = subjects;
	}

	public void display() {
		System.out.println("============Student===========");
		System.out.println("Name: " + name);
		System.out.println("Id: " + sid);
		System.out.println("==================Subjects==============");
		for (String sub : subjects) {
			System.out.println(sub);
		}

	}
}
