import fly.CantFly;
import fly.ItFlys;

public class Bird extends Animal {
    public Bird() {
        super();
        setSound("Chirp");

        ItFlys _flyType = new ItFlys();
        setFlyingType(_flyType);
    }


}
