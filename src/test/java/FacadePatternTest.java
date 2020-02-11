import facade.BankAccountFacade;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FacadePatternTest {
    @Test
    public void facadePatternTest() throws Exception {
        BankAccountFacade accessingBank = new BankAccountFacade(123456789, 123);
        accessingBank.withdrawCash(50.0);
        accessingBank.withdrawCash(900.0);
        accessingBank.depositCash(200.0);

        assertThat(accessingBank.getBalance(), is("Your current balance is: $250.0"));
    }
}
