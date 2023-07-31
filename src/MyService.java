package src;

public class MyService {
    public void doSomething(int value) throws IllegalArgumentException, IllegalStateException {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative.");
        } else if (value > 100) {
            throw new IllegalStateException("Value is too large.");
        }

        // Rest of the  Business Logics
    }
}
