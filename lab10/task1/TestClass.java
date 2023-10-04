package lab10.task1;

public class TestClass {
    public static void main(String[] args) {
        Student s = new Student("John", 23, 123);
        Teacher t = new Teacher("Alice", 32, "CSE");
        s.types();
        Student.StaticMethod();

        System.out.println("Teacher");
        t.display();
        t.types();
        Teacher.StaticMethod();

    }
}
