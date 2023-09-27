package lab07.Task1;

public class Person {
    private String name;
    private int age;

    Person() {

    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void details() {
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
    }

    public void speak() {
        System.out.println("Learn Java");
    }
}
