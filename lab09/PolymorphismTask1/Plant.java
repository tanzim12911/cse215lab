public class Plant {
    private String name;
    private String color;

    Plant() {
    }
    Plant(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Plant Class: name = " + name + ", color = " + color + ", ";
    }
}
