package HomeWork9;

import java.util.regex.Pattern;

public class Auntification {

    public static boolean auntification(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() > 19 || login.contains(" ")) {
            throw new WrongLoginException("Invalid Login");
        }


        if (password.length() >19 || password.contains(" ") ||!password.matches(".*\\d.*") ||
                 !password.equals(confirmPassword)) {

            throw new WrongPasswordException("Invalid password");
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            auntification("12345asd8567891", "passw1or", "passw1or");
            System.out.println("Verification passed");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Auntification failed: " + e.getMessage());
        }

    }


}
