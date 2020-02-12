package facade;

public class BankAccountFacade {
    private int _accountNumber;
    private int _securityCode;

    private AccountNumberChecker _accountNumberChecker;
    private FundsChecker _fundsChecker;
    private SecurityCodeChecker _securityCodeChecker;
    private WelcomeToBank _welcomeToBank;

    public BankAccountFacade(int accountNumber, int securityCode) {
        _accountNumber = accountNumber;
        _securityCode = securityCode;

        _accountNumberChecker = new AccountNumberChecker();
        _fundsChecker = new FundsChecker();
        _securityCodeChecker = new SecurityCodeChecker();
        _welcomeToBank = new WelcomeToBank();
    }

    public int getAccountNumber() {
        return _accountNumber;
    }

    public int getSecurityCode() {
        return _securityCode;
    }

    public void withdrawCash(double cashToWithdraw) throws Exception {
        System.out.println("Start transaction");
        System.out.println("Operation: " + cashToWithdraw + " - withdraw");

        if (canWithdrawMoney(cashToWithdraw)) {
            _fundsChecker.withdrawCash(cashToWithdraw);
            System.out.println("Transaction succeeded");
            return;
        }

        throw new Exception("Transaction failed");
    }

    public void depositCash(double cashToDeposit) throws Exception {
        System.out.println("Start transaction");
        System.out.println("Operation: " + cashToDeposit + " - deposit");

        if (isValidAccount()) {
            _fundsChecker.depositCash(cashToDeposit);
            return;
        }

        throw new Exception("Transaction failed");
    }

    private boolean isValidAccount() {
        return _accountNumberChecker.isAccountActive(getAccountNumber()) &&
                _securityCodeChecker.isCodeCorrect(getSecurityCode());
    }

    private boolean canWithdrawMoney(double cashToWithdraw) {
        return _accountNumberChecker.isAccountActive(getAccountNumber()) &&
                _securityCodeChecker.isCodeCorrect(getSecurityCode()) &&
                _fundsChecker.accountHasEnoughMoney(cashToWithdraw);
    }

    public String getBalance() {
        if (isValidAccount()) {
            return "Your current balance is: $" + _fundsChecker.getBalance();
        }

        return "your balance is: 0";
    }
}
