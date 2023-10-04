package lab10.task1;

public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void display();

    public abstract void types();

    public static void StaticMethod() {
        System.out.println("This is a static method.");
    }
    
}
