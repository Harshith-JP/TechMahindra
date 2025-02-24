import java.util.Arrays;

public class ArrayComparator {

    public static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Integer[] a1 = {1, 2, 3, 4};
        Integer[] a2 = {1, 2, 3, 4};
        Integer[] a3 = {1, 2, 3, 5};

        System.out.println("Are arrays equal? " + compareArrays(a1, a2)); 
        System.out.println("Are arrays equal? " + compareArrays(a1, a3)); 
    }
}
