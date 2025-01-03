package XmlandAnnotation;

import org.springframework.stereotype.Component;

@Component(value="myStudent")
public class Student {
	public void play() {
		System.out.println("Student is palyaing");
	}
}
