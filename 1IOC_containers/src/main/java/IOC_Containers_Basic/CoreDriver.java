package IOC_Containers_Basic;


import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CoreDriver {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("IOC_config.xml");
		BeanFactory factory =new XmlBeanFactory(r);
		
		Student std =(Student) factory.getBean("myStudent");
		std.bunk();
	}

}
