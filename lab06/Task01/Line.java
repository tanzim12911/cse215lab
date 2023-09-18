package lab06.Task01;

public class Line {
    private Point start;
    private Point end;
    
    Line() {
        
    }
    
    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    
    Line(int x1, int y1, int x2, int y2) {
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        
        this.start = p1;
        this.end = p2;
    }
    
    public Point getStart() {
        return start;
    }
    
    public Point getEnd() {
        return end;
    }
    
    public void setStart(Point start) {
        this.start = start;
    }
    
    public void setEnd(Point end) {
        this.end = end;
    }
    
    public double length() {
        int x1 = start.getX();
        int y1 = start.getY();
        
        int x2 = end.getX();
        int y2 = end.getY();
        
        return Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));
    }
}
