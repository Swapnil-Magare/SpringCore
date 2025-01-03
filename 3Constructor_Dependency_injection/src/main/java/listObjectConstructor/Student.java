package listObjectConstructor;

import java.util.List;

public class Student {
    String name;
    List<Subject> subjects;

    // Constructor for dependency injection
    public Student(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public void display() {
        System.out.println("==================Student================");
        System.out.println("Name: " + name);

        System.out.println("==============Subjects=============");
        for (Subject sub : subjects) {
            System.out.println("Subject: " + sub.name);
            System.out.println("Duration: " + sub.days + " Days");
            System.out.println("==================================");
        }
    }
}
