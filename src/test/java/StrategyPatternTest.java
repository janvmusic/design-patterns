import fly.ItFlys;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StrategyPatternTest {

    @Test
    public void testTryFly() {
        Dog coco = new Dog();
        assertThat("Dogs should not be able to fly", coco.tryToFly(), is("I can't fly"));

        coco.setFlyingType(new ItFlys());
        assertThat("Dogs grew wings and now it's able to fly!", coco.tryToFly(), is("Fly high!"));

        Bird bird = new Bird();
        assertThat("Birds should fly", bird.tryToFly(), is("Fly high!"));
    }
}
