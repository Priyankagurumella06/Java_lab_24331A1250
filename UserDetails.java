import java.util.Scanner;

class PasswordMismatchException extends Exception {
    PasswordMismatchException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            if (username.length() > 8) {
                throw new Exception("Username should not exceed 8 characters.");
            }

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (password.length() < 5 || password.length() > 8) {
                throw new Exception("Password length must be between 5 and 8 characters.");
            }

            System.out.print("Re-enter Password: ");
            String confirmPassword = sc.nextLine();

            if (!password.equals(confirmPassword)) {
                throw new PasswordMismatchException("Password Mismatch! Re-entered password is incorrect.");
            }

            System.out.println("Username and Password accepted successfully.");

        } catch (PasswordMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

