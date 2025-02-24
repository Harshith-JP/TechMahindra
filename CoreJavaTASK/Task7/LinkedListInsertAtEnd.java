import java.util.LinkedList;

public class LinkedListInsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        
        colors.addLast("Green"); 
        System.out.println("Linked List after insertion: " + colors);
    }
}
