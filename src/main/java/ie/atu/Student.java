package ie.atu;

import java.util.Scanner;

public class Student {
    String name;
    String email;
    String course;

    //constructor
    public Student() {

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
