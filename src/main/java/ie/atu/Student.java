package ie.atu;

import java.util.Scanner;

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

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter students name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter students email: ");
        this.email = scanner.nextLine();

        System.out.print("Enter students course: ");
        this.course = scanner.nextLine();
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " " + "Email: " + email + " " + "Course: " + course);
    }

}
