public class TestClass {
    public static void main(String[] args) {
        Plant[] p = new Plant[5];
        p[0] = new Flower("Rose", "Red", true, true);
        p[1] = new Herb("Basil", "Green", true, "Summer");
        p[2] = new Flower("Daffodil", "Yellow", true, false);
        p[3] = new Herb("Bayleaf", "Brown", true, "Spring");

        display(p);
        add(p, null);
        search(p, "Daffodil");

    }

    static void display(Plant[] plants) {
            for(Plant i : plants) {
                if(i != null) {
                    System.out.println(i);
                }
            }
    }

    static void add(Plant[] plants, Plant p) {
        for(int i = 0; i < plants.length; i++) {
                if(plants[i] == null) {
                    plants[i] = p;
                }
        }
    }

    static void remove(Plant[] plants, String n) {
        for(int i = 0; i < plants.length; i++) {
                if(plants[i].getName().equals(n)) {
                    plants[i].setName(null);
                }
        }
    }

    static Plant search(Plant[] plants, String n) {
        Plant result = new Plant();
        for(int i = 0; i < plants.length; i++) {
                if(plants[i].getName().equals(n)) {
                    result = plants[i];
                }
        }
        return result;
    }

    
}
