package facade;

public class AccountNumberChecker {
    private int _accountNumber = 123456789;

    public int getAccountNumber() {
        return _accountNumber;
    }

    public boolean isAccountActive(int accountNumber) {
        return accountNumber == _accountNumber;
    }
}
