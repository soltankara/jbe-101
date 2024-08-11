package productsHomework.exceptions;

public class CapacityIsFullException extends RuntimeException {
    public CapacityIsFullException(String message) {
        super(message);
    }
}
