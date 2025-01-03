package AnnotationInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value(value ="Dinaga")
	String name;
	
	@Value(value ="45")
	int age;
	
	public void display() {
		System.out.println("=======================================");
		System.out.println("Student Name: "+ name);
		System.out.println("Age: "+ age);
	}
	
}
