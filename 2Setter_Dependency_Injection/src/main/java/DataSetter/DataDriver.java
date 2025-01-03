package DataSetter;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp= new ClassPathXmlApplicationContext("DI_Setter_Data.xml");
		
		Student s1 =(Student) cApp.getBean("myStudent");
		System.out.println("==========Student==========");
		System.out.println(s1.getSid());
		System.out.println(s1.getName());
		s1.Bunk();
	}

}
