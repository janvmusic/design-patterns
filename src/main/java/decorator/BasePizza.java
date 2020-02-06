package decorator;

public class BasePizza implements Pizza {

    @Override
    public String getDescription() {
        return "Thin dough";
    }

    @Override
    public double getCost() {
        return 4.0;
    }
}
