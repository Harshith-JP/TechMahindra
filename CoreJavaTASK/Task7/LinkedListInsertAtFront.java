import java.util.LinkedList;

public class LinkedListInsertAtFront {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        
        colors.addFirst("Yellow");
        
        System.out.println("Linked List after insertion: " + colors);
    }
}
