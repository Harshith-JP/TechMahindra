import java.io.File;
import java.util.Scanner;

public class PermissionChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file or directory path: ");
        String path = scanner.nextLine();

        int permissions = getPermissions(path);

        if (permissions == -1) {
            System.out.println("File not found!");
        } else if (permissions == 0) {
            System.out.println("No permissions.");
        } else if (permissions == 1) {
            System.out.println("Read-only permissions.");
        } else if (permissions == 2) {
            System.out.println("Read and write permissions.");
        } else if (permissions == 3) {
            System.out.println("Read, write, and execute permissions.");
        }
    }

    public static int getPermissions(String path) {
        File file = new File(path);
        
        if (!file.exists()) {
            return -1;
        }

        int permissions = 0;

        if (file.canRead()) {
            permissions = 1;

            if (file.canWrite()) {
                permissions = 2;

                if (file.canExecute()) {
                    permissions = 3;
                }
            }
        }

        return permissions;
    }
}
