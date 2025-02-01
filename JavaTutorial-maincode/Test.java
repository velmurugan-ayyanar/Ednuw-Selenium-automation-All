



import java.util.Scanner;

class ValueTooLowException extends Exception {
    public ValueTooLowException(String message) {
        super(message);
    }

}
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            
            if (num < 50) {
                throw new ValueTooLowException("The entered number is less than 50!");
            }
            
            System.out.println("Valid input: " + num);
        } catch (ValueTooLowException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}
