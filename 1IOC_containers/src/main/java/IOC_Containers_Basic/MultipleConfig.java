package IOC_Containers_Basic;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MultipleConfig {

	public static void main(String[] args) {
		ApplicationContext App = new ClassPathXmlApplicationContext("IOC_config.xml");
		
		Student std=(Student)App.getBean("myStudent");
		std.bunk();
		Person person = (Person)App.getBean("myPerson");
		person.run();
		
		System.out.println("=======================================================");
		
		ApplicationContext App1 = new ClassPathXmlApplicationContext("IOC_config.xml");
		Student std1=(Student)App1.getBean("myStudent");
		std.bunk();
		Person person1 = (Person)App1.getBean("myPerson");
		person.run();
	}

}
