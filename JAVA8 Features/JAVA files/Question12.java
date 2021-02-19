import java.util.List;

//Find the first even number in the integer list which is greater than 3.
public class Question12 {
    public static void main(String[] args) {
        sumOfGreaterThan5(List.of(1, 4, 3, 6, 5, 7, 8, 9, 8, 10, 2, 3));
    }

    public static void sumOfGreaterThan5(List<Integer> numbers) {
        System.out.println(numbers.stream()
                .filter(num -> num % 2 == 0 && num > 3)
                .findFirst());
    }
}

