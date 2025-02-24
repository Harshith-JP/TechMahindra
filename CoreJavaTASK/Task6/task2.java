import java.util.List;

public class FirstOccurrenceIndex {
    public static <T> int getFirstIndex(List<T> list, T target) {
        return list.indexOf(target);
    }

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "Bob");
        System.out.println("Index of 'Bob': " + getFirstIndex(names, "Bob")); // 1
        System.out.println("Index of 'David': " + getFirstIndex(names, "David")); // -1
    }
}
