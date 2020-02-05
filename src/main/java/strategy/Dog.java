package strategy;

import strategy.fly.CantFly;

public class Dog extends Animal {

    public Dog() {
        super();
        setSound("Bark");

        CantFly _flyType = new CantFly();
        setFlyingType(_flyType);
    }

    public void digHole() {
        System.out.println("Hole dug");
    }
}
