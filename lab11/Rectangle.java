public class Rectangle implements Shape, Type {
    int l, w;

    public Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }

    public int getI() {
        return l;
    }

    public void setI(int l) {
        this.l = l;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    @Override
    public void area() {
        System.out.println("Area: " + l * w);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter: " + 2 * (l + w));
    }

    @Override
    public void type() {
        System.out.println("This is a rectangle");
    }
}
