// Goal is to extend the pre-existing exception that most closely matches your custom exception situation
public class AgeLessThanZeroException extends IllegalArgumentException {
    // To allow for calling exception without any arguments passed in
    public AgeLessThanZeroException(){}

    // To pass in custom message when exception occurs
    public AgeLessThanZeroException(String message) {
        super(message);
    }

    // Whatever throwable caused exception; can also be combined with previous constructor as (String message, Throwable cause) with super(message, cause)
    public AgeLessThanZeroException(Throwable cause) {
        super(cause);
    }
}