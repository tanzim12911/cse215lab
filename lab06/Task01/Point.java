package lab06.Task01;

public class Point {

    private int x;
    private int y;
    
    Point() {
        
    }
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    
    public double distance(Point point) {
        int x1 = this.getX();
        int y1 = this.getY();
        
        int x2 = point.getX();
        int y2 = point.getY();
        
        return Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));
    }
    
}

