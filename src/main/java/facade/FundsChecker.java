package facade;

public class FundsChecker {
    private double _cashInAccount = 1000.0;

    public double getBalance() {
        return _cashInAccount;
    }

    public void withdrawCash(double cashToWithdraw) {
        if (accountHasEnoughMoney(cashToWithdraw)) {
            _cashInAccount -= cashToWithdraw;
        }
    }

    public void depositCash(double cashToDeposit) {
        _cashInAccount += cashToDeposit;
    }

    public boolean accountHasEnoughMoney(double cashToWithdraw) {
        return getBalance() > 0 && cashToWithdraw < getBalance();
    }
}
