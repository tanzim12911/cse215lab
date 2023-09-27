public class Flower extends Plant {
    private boolean hasSmell;
    private boolean hasThorn;
    
    Flower() {
    }
    Flower(boolean hasSmell, boolean hasThorn) {
        this.hasSmell = hasSmell;
        this.hasThorn = hasThorn;
    }
    Flower(String name, String color, boolean hasSmell, boolean hasThorn) {
        super(name, color);
        this.hasSmell = hasSmell;
        this.hasThorn = hasThorn;
    }

    public boolean getHasSmell() {
        return hasSmell;
    }
    public boolean getHasThorn() {
        return hasThorn;
    }

    public void setHasSmell(boolean hasSmell) {
        this.hasSmell = hasSmell;
    }
    public void setHasThorn(boolean hasThorn) {
        this.hasThorn = hasThorn;
    }

    @Override
    public String toString() {
        return super.toString() + " hasSmell = " + hasSmell + ", hasThorn = " + hasThorn;
    }
    

}
