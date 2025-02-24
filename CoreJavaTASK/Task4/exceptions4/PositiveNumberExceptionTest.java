package Task3;
import java.io.File;
import java.util.Scanner;

public class PositiveNumberExceptionTest {

    public static void main(String[] args) {
        try {
            // Open the file for reading
            File fl = new File("C:\\Users\\USER\\Downloads\\file input");
            Scanner sc = new Scanner(fl);
            
            // Read numbers from the file
            while (sc.hasNextLine()) {
                int num = Integer.parseInt(sc.nextLine().trim()); // Parse each number
                
                // If the number is positive, throw the custom exception
                if (num > 0) {
                    throw new PositiveNumberException("The Number " + num + " is positive.");
                }
            }
            // Close the scanner after reading
            sc.close();

        } catch (PositiveNumberException e) {
            // Handle the custom exception
            System.out.println("Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions (e.g., file not found)
            System.out.println("Error: " + e.getMessage());
        }
    }
}


