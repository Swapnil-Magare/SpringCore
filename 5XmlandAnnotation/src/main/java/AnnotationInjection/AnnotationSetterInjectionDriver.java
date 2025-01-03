package AnnotationInjection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationSetterInjectionDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("config.xml");

//		VARIABLE INJECTION
		Student std = (Student) cApp.getBean("student");
		std.display();

//		SETTER INJECTION
		Person person = (Person) cApp.getBean("person");
		person.display();

//		CONSTRUCTOR INJECTION
		Teacher tech = (Teacher) cApp.getBean("teacher");
		System.out.println(tech);
	}

}
