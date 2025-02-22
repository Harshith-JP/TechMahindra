package coreJAVAtasks;
import java.util.*;

public class AlternatieElements {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        
        int copySize = (size + 1) / 2; 
        int[] copy = new int[copySize];

        int j = 0; 
        for (int i = 0; i < size; i += 2) { 
            copy[j] = arr[i];
            j++;
        }

        for (int i = 0; i < copySize; i++) { 
            System.out.println(copy[i]);
        }
        s.close(); 
    }
}
