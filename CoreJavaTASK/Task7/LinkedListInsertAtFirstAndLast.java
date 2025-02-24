import java.util.LinkedList;

public class LinkedListInsertAtFirstAndLast {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        
        colors.addFirst("Yellow"); 
        colors.addLast("Green"); 
        System.out.println("Updated Linked List: " + colors);
    }
}
