package XmlandAnnotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("config.xml");
		
		Student stu =(Student) cApp.getBean("myStudent");
		stu.play();
		
		PersonApp person = (PersonApp) cApp.getBean("personApp");
		person.dance();
	}

}
