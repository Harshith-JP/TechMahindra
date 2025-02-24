package Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileAndCheckEmpty {

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\USER\\Downloads\\file input");
            if (!file.exists()) {
                throw new FileNotFoundException("File not found: " + file.getAbsolutePath());
            }

            Scanner sc = new Scanner(file);
            if (!sc.hasNextLine()) {
                throw new EmptyFileException("The file is empty.");
            }

            System.out.println("File has content.");
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
