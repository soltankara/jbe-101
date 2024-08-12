package Module02.Session13;

public class WithDrawException extends RuntimeException{
    private String message;

    public WithDrawException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
