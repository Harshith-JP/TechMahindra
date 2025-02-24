import java.io.File;
import java.util.Scanner;

public class ListFiles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = input.nextLine();

        list(path);
    }

    public static void list(String path) {
        File dir = new File(path);

        if (dir.isDirectory()) {
            System.out.println("\nDirectory: " + dir.getName());
            File[] items = dir.listFiles();

            for (File item : items) {
                if (item.isFile()) {
                    System.out.println(item.getName());
                } else if (item.isDirectory()) {
                    System.out.println("\nSubdirectory: " + item.getName());
                    list(item.getAbsolutePath());
                }
            }
        } else if (dir.isFile()) {
            System.out.println("File: " + dir.getName());
        }
    }
}
