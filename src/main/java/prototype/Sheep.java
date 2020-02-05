package prototype;

public class Sheep implements Animal {
    public Sheep() {
        System.out.println("Sheep is made");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is being made");
        Sheep clonedSheep = null;

        try {
            clonedSheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clonedSheep;
    }

    public String toString() {
        return "Dolly is my hero, baaaa";
    }
}
