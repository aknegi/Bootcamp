
// Collect all the even numbers from an integer list.

import java.util.List;
import java.util.stream.Collectors;

public class Question9 {
    public static void main(String[] args) {
        System.out.println(getEvenNumbers(List.of(12, 45, 65, 777, 8, 34, 5, 43)));
    }

    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

    }
}
