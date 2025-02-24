import java.io.File;
import java.util.Scanner;

public class FileExtensionFilter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the directory path: ");
        String dirPath = sc.nextLine();

        System.out.print("Enter the file extension (e.g., txt, jpg): ");
        String ext = sc.nextLine();

        findFilesWithExtension(dirPath, ext);
    }

    public static void findFilesWithExtension(String dirPath, String ext) {
        File dir = new File(dirPath);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory path. Please ensure the directory exists.");
            return;
        }

        File[] files = dir.listFiles();
        boolean found = false;
        int count = 0;

        for (File file : files) {
            if (file.isFile()) {
                String fileName = file.getName();
                String fileExt = fileName.substring(fileName.lastIndexOf('.') + 1);

                if (fileExt.equalsIgnoreCase(ext)) {
                    System.out.println(fileName);
                    found = true;
                    count++;
                }
            } else if (file.isDirectory()) {
                findFilesWithExtension(file.getAbsolutePath(), ext);
            }
        }

        if (!found) {
            System.out.println("No files with extension '" + ext + "' found in " + dirPath);
        } else {
            System.out.println("Found " + count + " file(s) with extension '" + ext + "' in " + dirPath);
        }
    }
}
