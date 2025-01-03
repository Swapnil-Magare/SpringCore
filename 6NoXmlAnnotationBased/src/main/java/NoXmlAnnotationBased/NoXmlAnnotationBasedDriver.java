package NoXmlAnnotationBased;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class NoXmlAnnotationBasedDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new AnnotationConfigApplicationContext(AppConfig.class);

//  VARIABLE INJECTION
		Student std = (Student) cApp.getBean("student");
		std.display();

//	SETTER INJECTION
		Person person = (Person) cApp.getBean("person");
		person.display();

//	CONSTRUCTOR INJECTION
		Teacher tech = (Teacher) cApp.getBean("teacher");
		System.out.println(tech);
	}

}
