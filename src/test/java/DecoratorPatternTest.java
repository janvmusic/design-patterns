import decorator.BasePizza;
import decorator.Mozzarella;
import decorator.Pizza;
import decorator.TomatoSauce;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DecoratorPatternTest {
    @Test
    public void decoratorPatternTest() {
        Pizza pizzaWithEverything = new TomatoSauce(new Mozzarella(new BasePizza()));
        assertThat("Pizza should have all ingredients", pizzaWithEverything.getDescription(), is("Thin dough, mozzarella, tomato sauce"));

        Pizza pizzaWithMozzarella = new Mozzarella(new BasePizza());
        assertThat("Pizza should have mozzarella", pizzaWithMozzarella.getDescription(), is("Thin dough, mozzarella"));

        Pizza pizzaWithTomatoSauce = new TomatoSauce(new BasePizza());
        assertThat("Pizza should have tomato sauce", pizzaWithTomatoSauce.getDescription(), is("Thin dough, tomato sauce"));

        Pizza plainPizza = new BasePizza();
        assertThat("Pizza should have tomato sauce", plainPizza.getDescription(), is("Thin dough"));
    }
}
