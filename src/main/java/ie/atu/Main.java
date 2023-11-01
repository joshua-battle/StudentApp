package ie.atu;


public class Main {
    public static void main(String[] args) {
        //create new student object
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        //get user input
        s1.getUserInput();
        s2.getUserInput();
        s3.getUserInput();

        //call display info method
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}