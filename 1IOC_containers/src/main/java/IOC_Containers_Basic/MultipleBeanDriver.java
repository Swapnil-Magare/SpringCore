package IOC_Containers_Basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MultipleBeanDriver {

	public static void main(String[] args) {
		ApplicationContext App =new ClassPathXmlApplicationContext("IOC_config.xml");
		
		Student std =(Student) App.getBean("myStudent");
		std.bunk();
		
		Person person =(Person) App.getBean("myPerson");
		person.run();
	}

}
