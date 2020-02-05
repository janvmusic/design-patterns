import org.junit.Test;
import strategy.Dog;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WorkWithAnimalsTest {

    @Test
    public void testWeightNeedsToBeGreaterThanZero() {
        Dog fido = new Dog();
        fido.setName("Fido");
        fido.setWeight(-1);

        assertThat("You should not set weight that is less than zero", fido.getWeight(), is(0));
    }

    @Test
    public void testSetWeight() {
        Dog fido = new Dog();
        fido.setName("Fido");
        fido.setWeight(50);

        assertThat("You should not set weight that is less than zero", fido.getWeight(), is(50));
    }

    @Test
    public void testHeightNeedsToBeGreaterThanZero() {
        Dog fido = new Dog();
        fido.setName("Fido");
        fido.setHeight(-1);

        assertThat("You should not set weight that is less than zero", fido.getHeight(), is(0));
    }

    @Test
    public void testSetHeight() {
        Dog fido = new Dog();
        fido.setName("Fido");
        fido.setHeight(50);

        assertThat("You should not set weight that is less than zero", fido.getHeight(), is(50));
    }
}
