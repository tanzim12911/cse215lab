public class Circle implements Shape, Type {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void area() {
        System.out.println("Area: " + Math.PI * r * r);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter: " + (2 * Math.PI * r));
    }

    @Override
    public void type() {
        System.out.println("This is a circle");
    }

    
}
