package interpretercomponents;

public class BreakException extends RuntimeException {
    public BreakException() {
        super("Break statement executed");
    }
}
