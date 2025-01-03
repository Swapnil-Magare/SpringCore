package DbRead;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dataConstructor.Student;

public class DBDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("DI_Constructor_DBRead.xml");

		DBTest db = (DBTest) cApp.getBean("DBRead");
		db.display();
	}

}
