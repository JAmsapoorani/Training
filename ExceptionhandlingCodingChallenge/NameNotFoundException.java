package ExceptionhandlingCodingChallenge;

public class NameNotFoundException extends RuntimeException{
    public NameNotFoundException()
    {
        super();
    }
    public NameNotFoundException(String s) {
        super(s);
    }
}
