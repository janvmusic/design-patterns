package facade;

public class SecurityCodeChecker {
    private int _securityCode = 123;

    public int getSecurityCode() {
        return _securityCode;
    }

    public boolean isCodeCorrect(int securityCode) {
        return _securityCode == securityCode;
    }
}
