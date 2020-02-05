package factory;

public abstract class BaseEnemyShip {
    private String _name;
    private double _amountDamage;

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public double getDamage() {
        return _amountDamage;
    }

    public void setDamage(double damage) {
        _amountDamage = damage;
    }

    public void followHeroShop() {
        System.out.println(getName() + " is following hero's ship");
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipAttack() {
        System.out.println(getName() + " attack does " + getDamage());
    }
}
