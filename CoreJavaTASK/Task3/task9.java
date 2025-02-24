import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        File file = new File(path);

        if (!file.exists() || !file.isFile()) {
            System.out.println("Invalid file path.");
        } else {
            try {
                byte[] data = readFile(file);
                System.out.println("File read successfully. Byte array length: " + data.length);
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }

    private static byte[] readFile(File file) throws IOException {
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] byteArray = new byte[(int) file.length()];
            fis.read(byteArray);
            return byteArray;
        }
    }
}
