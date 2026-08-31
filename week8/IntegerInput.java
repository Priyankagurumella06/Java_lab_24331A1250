import java.util.Scanner;
import java.util.InputMismatchException;

class IntegerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int n = sc.nextInt();

            System.out.println("You entered: " + n);
        } 
        catch (InputMismatchException e) {
            System.out.println("Exception: Please enter a valid integer.");
        } 
        finally {
            System.out.println("Finally block executed.");
        }
    }
}