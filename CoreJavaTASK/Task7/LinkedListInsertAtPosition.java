import java.util.LinkedList;

public class LinkedListInsertAtPosition {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        
        colors.add(1, "Yellow"); 
        
        System.out.println("Updated Linked List: " + colors);
    }
}
