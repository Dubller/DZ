package HomeWork9;

public class WrongLoginException extends Exception {
    public WrongLoginException(String invalidLogin) {
    super(invalidLogin);
    }
}
