package session21.exception;

public class StudentNotFoundException extends StudentException {

    public StudentNotFoundException() {
    }

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
