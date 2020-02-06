import org.junit.Test;
import strategy.Bird;
import strategy.Dog;
import strategy.fly.ItFlys;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StrategyPatternTest {

    @Test
    public void testTryFly() {
        Dog coco = new Dog();
        assertThat("Dogs should not be able to strategy.fly", coco.tryToFly(), is("I can't strategy.fly"));

        coco.setFlyingType(new ItFlys());
        assertThat("Dogs grew wings and now it's able to strategy.fly!", coco.tryToFly(), is("Fly high!"));

        Bird bird = new Bird();
        assertThat("Birds should strategy.fly", bird.tryToFly(), is("Fly high!"));
    }
}
