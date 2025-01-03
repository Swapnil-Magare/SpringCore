package AnnotationInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String name;
	
	private int age;

	public String getName() {
		return name;
	}
	
	@Value(value ="Managa")
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	@Value(value ="55")
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("=======================================");
		System.out.println("PersonName: "+ name);
		System.out.println("Age: "+ age);

	}
	
	
}
