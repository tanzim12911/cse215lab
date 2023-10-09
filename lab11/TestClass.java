public class TestClass {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(6, 5);

        System.out.println("Circle: ");
        c.area();
        c.perimeter();

        System.out.println("Rectangle: ");
        r.area();
        r.perimeter();
    }
}
