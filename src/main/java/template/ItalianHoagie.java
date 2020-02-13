package template;

public class ItalianHoagie extends HoagieTemplate {

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
        System.out.print("Adding condiments: ");
        for (String cheese : cheeseAvailable) {
            System.out.print(cheese + ",");
        }

        System.out.println();
    }

    @Override
    protected void addMeat() {
        System.out.print("Adding condiments: ");
        for (String meat : meatAvailable) {
            System.out.print(meat + ",");
        }

        System.out.println();
    }
}
