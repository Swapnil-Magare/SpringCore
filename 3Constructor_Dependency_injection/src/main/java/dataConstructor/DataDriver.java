package dataConstructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("DI_Constructor_Data.xml");
		
		Student std = (Student) cApp.getBean("StudentObject");
		std.display();
	}

}
