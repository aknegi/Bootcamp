//Sum all the numbers greater than 5 in the integer list.

import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        System.out.println(sumOfGreaterThan5(List.of(1, 4, 5, 7, 8, 9, 8)));
    }

    public static int sumOfGreaterThan5(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num > 5)
                .reduce(0, (x, y) -> x + y);
    }
}
