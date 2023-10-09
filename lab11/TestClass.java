public class TestClass {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(6, 5);
        Type t = new Type();

        System.out.println("Circle: ");
        c.area();
        c.perimeter();
        c.type();

        System.out.println("Rectangle: ");
        r.area();
        r.perimeter();
        r.type();

        System.out.println("Type: ");
        t.type();


    }
}
