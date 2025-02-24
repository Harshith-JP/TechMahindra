import java.io.Console;

public class ConsoleInput {

    public static void main(String[] args) {
        Console con = System.console();

        if (con == null) {
            System.out.println("No console available.");
            return;
        }

        String userInput = con.readLine("Enter text: ");
        System.out.println("You entered: " + userInput);
    }
}
