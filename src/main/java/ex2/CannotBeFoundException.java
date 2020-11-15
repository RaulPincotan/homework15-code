package ex2;

public class CannotBeFoundException extends RuntimeException {
    public CannotBeFoundException(String message) {
        super(message);
    }
}
