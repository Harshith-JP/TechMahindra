import java.util.List;

public class EvenOddSum {
    public static <T extends Number> void calculateEvenOddSum(List<T> numbers) {
        double evenSum = 0, oddSum = 0;
        for (T num : numbers) {
            if (num.intValue() % 2 == 0) {
                evenSum += num.doubleValue();
            } else {
                oddSum += num.doubleValue();
            }
        }
        System.out.println("Even Numbers Sum: " + evenSum);
        System.out.println("Odd Numbers Sum: " + oddSum);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        calculateEvenOddSum(numbers);
    }
}
