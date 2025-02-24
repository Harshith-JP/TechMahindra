import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FileModificationDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String filePath = scanner.nextLine();
        
        File file = new File(filePath);

        if (file.exists()) {
            long lastModified = file.lastModified();
            DateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");
            System.out.println("Last modified on: " + dateFormat.format(lastModified));
        } else {
            System.out.println("File not found!");
        }
    }
}
