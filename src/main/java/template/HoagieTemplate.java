package template;

public abstract class HoagieTemplate {
    String[] meatAvailable = {"Salami", "Pepperoni", "Capicola han"};
    String[] cheeseAvailable = {"Provolone"};
    String[] vegetablesAvailable = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsAvailable = {"Oil", "Vinegar"};

    final public void makeSandwich() {
        cutBun();

        if (customerWantsMeat()) {
            addMeat();
        }

        if (customerWantsCheese()) {
            addCheese();
        }

        if (customerWantsVegetables()) {
            addVegetables();
        }

        if (customerWantsCondiments()) {
            addCondiments();
        }

        wrapHoagie();
    }

    private void wrapHoagie() {
        System.out.println("Wrap the hoagie");
        System.out.println();
    }

    private void cutBun() {
        System.out.println("Cut the bun");
    }

    protected abstract void addCondiments();

    protected abstract void addVegetables();

    protected abstract void addCheese();

    protected abstract void addMeat();

    protected boolean customerWantsCondiments() {
        return true;
    }

    protected boolean customerWantsVegetables() {
        return true;
    }

    protected boolean customerWantsCheese() {
        return true;
    }

    protected boolean customerWantsMeat() {
        return true;
    }
}
