//Find average of the number inside integer list after doubling it.

import java.util.List;
import java.util.function.Function;

public class Question11 {
    public static void main(String[] args) {
        averageAfterDoubling(List.of(1, 4, 5, 7, 8, 9, 8));
    }

    public static void averageAfterDoubling(List<Integer> numbers) {
        Function<Integer, Integer> doubletheNum = num -> num + num;
        System.out.println(numbers.stream()
                .mapToDouble(x -> x * 2)
                .average().orElse(0.0));
    }
}
