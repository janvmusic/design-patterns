package template;

public class VeggieHoagie extends HoagieTemplate {

    @Override
    protected void addCondiments() {
        System.out.print("Adding condiments: ");
        for (String condiment : condimentsAvailable) {
            System.out.print(condiment + ",");
        }

        System.out.println();
    }

    @Override
    protected void addVegetables() {
        System.out.print("Adding vegetables: ");
        for (String vegetable : vegetablesAvailable) {
            System.out.print(vegetable + ",");
        }

        System.out.println();
    }

    @Override
    protected void addCheese() {
        // not required
    }

    @Override
    protected void addMeat() {
        // not required
    }

    @Override
    protected boolean customerWantsCheese() {
        return false;
    }

    @Override
    protected boolean customerWantsMeat() {
        return false;
    }
}
