package lab10.task1;

public class Teacher extends Person {
    protected String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("Teacher name: " + name + " Subject: " + subject);
    }

    @Override
    public void types() {
        System.out.println("This is a teacher");
    }
}
