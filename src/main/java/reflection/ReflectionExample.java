package reflection;

public class ReflectionExample {
    private String _idCode = "100";

    public ReflectionExample(int number, String randString) {
        System.out.println("You sent: " + number + " " + randString);
    }

    public ReflectionExample(int number) {
        System.out.println("You sent: " + number);
    }

    public ReflectionExample(String randString) {
        System.out.println("You sent: " + randString);
    }

    private String getPrivate() {
        return "How did you get this?";
    }

    private String getOtherPrivate(int numericValue, String word) {
        return "How did you get here? " + numericValue + " " + word;
    }
}
