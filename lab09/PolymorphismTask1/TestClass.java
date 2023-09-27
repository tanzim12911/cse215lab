public class TestClass {
    public static void main(String[] args) {
        Plant[] p = new Plant[5];
        p[0] = new Flower("Rose", "Red", true, true);
        p[1] = new Herb("Basil", "Green", true, "Summer");
        p[2] = new Flower("Daffodil", "Yellow", true, false);
        p[3] = new Herb("Bayleaf", "Brown", true, "Spring");

        System.out.println("Intial Plants: ");
        display(p);
        System.out.println();
        
        System.out.println("Plant Added: ");
        add(p, new Flower("Sunflower", "Yellow", true, false));
        display(p);
        System.out.println();
        
        System.out.println("Plant Removed: ");
        remove(p, "Sunflower");
        display(p);
        System.out.println();
        
        System.out.println("Searched Plant: ");
        System.out.println(search(p, "Basil"));

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
                    plants[i] = null;
                }
        }
    }

    static Plant search(Plant[] plants, String n) {
        for(int i = 0; i < plants.length; i++) {
                if(plants[i].getName().equals(n)) {
                    return plants[i];
                }
        }

        return null;
       
    }

    
}
