package decorator;

public abstract class ToppingDecorator implements Pizza {
    protected Pizza _tempPizza;

    public ToppingDecorator(Pizza newPizza) {
        _tempPizza = newPizza;
    }

    @Override
    public String getDescription() {
        return _tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return _tempPizza.getCost();
    }
}
