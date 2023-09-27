public class Student extends Person {
    private int semester;
    private double cgpa;

    Student() {

    }

    Student(String name, int age, int semester, double cgpa) {
        super(name, age);
        this.semester = semester;
        this.cgpa = cgpa;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("My Semester is: " + semester);
        System.out.println("My CGPA is: " + cgpa);
    }
}
