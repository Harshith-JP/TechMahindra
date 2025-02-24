import java.util.LinkedList;

public class LinkedListFindFirstAndLastOccurrence {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Blue");
        
        int firstOccurrence = colors.indexOf("Blue"); // First occurrence of "Blue"
        int lastOccurrence = colors.lastIndexOf("Blue"); // Last occurrence of "Blue"
        
        System.out.println("First occurrence of Blue: " + firstOccurrence);
        System.out.println("Last occurrence of Blue: " + lastOccurrence);
    }
}
