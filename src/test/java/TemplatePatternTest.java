import org.junit.Test;
import template.HoagieTemplate;
import template.ItalianHoagie;
import template.VeggieHoagie;

public class TemplatePatternTest {

    @Test
    public void templatePatternTest() {
        HoagieTemplate customer12 = new ItalianHoagie();
        customer12.makeSandwich();

        HoagieTemplate customer13 = new VeggieHoagie();
        customer13.makeSandwich();
    }
}
