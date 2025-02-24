import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        
        if (colors.contains("Blue")) {
            System.out.println("Blue is found");
        } else {
            System.out.println("Blue is not found.");
        }
    }
}
