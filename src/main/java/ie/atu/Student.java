package ie.atu;

public class Student {
    String name;
    String email;
    String course;

    //constructor
    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " " + "Email: " + email + " " + "Course: " + course);
    }

}
