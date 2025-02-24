import java.io.File;
import java.util.Scanner;

public class FileSizeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        File file = new File(path);

        if (!file.exists() || !file.isFile()) {
            System.out.println("Invalid file path.");
        } else {
            long sizeBytes = file.length();
            double sizeKB = sizeBytes / 1024.0;
            double sizeMB = sizeKB / 1024.0;

            System.out.println("File size: ");
            System.out.println(sizeBytes + " Bytes");
            System.out.println(String.format("%.2f KB", sizeKB));
            System.out.println(String.format("%.2f MB", sizeMB));
        }

        sc.close();
    }
}
