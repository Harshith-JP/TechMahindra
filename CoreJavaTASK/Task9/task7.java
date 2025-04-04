import java.util.List;
import java.util.Optional;

public class FindMaxAndMinUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 45, 78, 23, 56, 89, 34, 67, 90, 11);

        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);

        System.out.println("Maximum Value: " + max.orElseThrow());
        System.out.println("Minimum Value: " + min.orElseThrow());
    }
}
