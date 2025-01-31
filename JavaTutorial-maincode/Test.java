import java.util.Scanner; // Import the Scanner class

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create a Scanner object


      

        if (1<50) {

            System.out.println("assess" );
            
        }

           // Read a string input

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Your age");
        int age = scanner.nextInt();

        // Display the user inputs
        
        System.out.println("Name: " + name);

        System.out.println("Age: " + age);

   
  
        

        scanner.close(); // Close the scanner
    }
}