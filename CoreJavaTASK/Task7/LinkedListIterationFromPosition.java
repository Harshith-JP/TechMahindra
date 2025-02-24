import java.util.LinkedList;

public class LinkedListIterationFromPosition {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        
        int startPos = 1; // Start from index 1 (Blue)
        for (int i = startPos; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
