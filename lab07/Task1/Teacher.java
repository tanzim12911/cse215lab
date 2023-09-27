package lab07.Task1;

public class Teacher extends Student {
    String subject;

    public Teacher() {
        
    }
    
    public Teacher(String name, int age, int semester, double cgpa, String subject) {
        super(name, age, semester, cgpa);
        this.subject = subject;
    }
}
