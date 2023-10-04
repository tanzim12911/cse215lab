package lab10.task1;

public class Student extends Person {
    protected int StudentID;

    Student (String name, int age, int StudentID) {
        super(name, age);
        this.StudentID = StudentID;
    }

    @Override
    public void display() {
        System.out.println("Student name: " + name + " Student age: " + age + "StudentID: " + StudentID);
    }

    @Override
    public void types() {
        System.out.println("This is a student");
    }
}
