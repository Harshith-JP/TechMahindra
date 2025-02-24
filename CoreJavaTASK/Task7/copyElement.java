import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("Blue");
        
        ArrayList<String> colors2 = new ArrayList<>(colors1); 
        
        System.out.println("Array List 2: " + colors2);
    }
}
