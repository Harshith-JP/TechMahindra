import java.io.File;
import java.util.Scanner;

public class FileChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file or directory path: ");
        String path = scanner.nextLine();

        if (doesExist(path)) {
            System.out.println("It exists!");
        } else {
            System.out.println("It does NOT exist!");
        }
    }

    public static boolean doesExist(String path) {
        return new File(path).exists();
    }
}
