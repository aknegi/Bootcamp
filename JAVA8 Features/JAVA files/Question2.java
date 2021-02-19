import java.util.function.BiFunction;

public class Question2 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addNums = (num1, num2) -> num1 + num2;
        System.out.println(addNums.apply(10, 20));


    }
}
