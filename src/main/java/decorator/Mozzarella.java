package decorator;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding dough");
        System.out.println("Adding mozzarella");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", mozzarella";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}
