import java.util.function.*;

public class Question5 {
    public static void main(String[] args) {

        functionalInterfaceExamples();
    }
    public static void functionalInterfaceExamples() {
        //Creating a Consumer
        Consumer<String> print = str -> System.out.println(str);
        print.accept("Hello World");

        //Creating a Supplier
        Supplier<String> returnOrgName = () -> "To The New";
        System.out.println(returnOrgName.get());

        // Creating a Predicate
        Predicate<Integer> smallerThan10 = num -> num < 10;
        System.out.println(smallerThan10.test(5));

        //Creating a Function
        Function<String, String> upperCase = str1 -> str1.toUpperCase();
        System.out.println(upperCase.apply("facebook"));
    }
}
