package HomeWork9;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String invalidPassword) {
        super(invalidPassword);
    }
}