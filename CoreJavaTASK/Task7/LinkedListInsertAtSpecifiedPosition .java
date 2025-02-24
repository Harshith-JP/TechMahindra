import java.util.LinkedList;

public class LinkedListInsertAtSpecifiedPosition {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        
        colors.add(1, "Yellow"); 
        colors.add(2, "Green"); 
        
        System.out.println("Linked List after insertion: " + colors);
    }
}
