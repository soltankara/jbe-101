package productsHomework.exceptions;

public class CategoryDoesNotMatchException extends RuntimeException{
    public CategoryDoesNotMatchException(String message) {
        super(message);
    }
}
