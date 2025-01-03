package NoXmlAnnotationBased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	String name;
	int age;

	public Teacher(@Value(value = "Kashi") String name, @Value(value = "77") int age) {

		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "=======================================\n Teacher [name=" + name + ", age=" + age + "]";
	}
}
