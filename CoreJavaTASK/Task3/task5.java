import java.io.File;
import java.util.Scanner;

public class PathTypeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file or folder name: ");
        String path = scanner.nextLine();
        File file = new File(path);

        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("It's a folder!");
            } else {
                System.out.println("It's a file!");
            }
        } else {
            System.out.println("The path does not exist.");
        }
    }
}
