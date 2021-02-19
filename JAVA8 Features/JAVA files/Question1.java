import java.util.function.*;

public class Question1 {
    public static void main(String[] args) {
        // (1) First number is greater than second number or not             Parameter (int ,int ) Return boolean
        BiPredicate<Integer,Integer> compareNums= (num1,num2) ->  num1>num2;
        System.out.println(compareNums.test(34,56));

        //(2) Increment the number by 1 and return incremented value    Parameter (int) Return int
        UnaryOperator<Integer> increMent= num1 -> ++num1;
        System.out.println(increMent.apply(10));

        //(3) Concatination of 2 string   Parameter (String , String ) Return (String)
        BiFunction<String ,String,String> concat= (str1,str2)-> str1+str2;
        System.out.println(concat.apply("Hello ","World"));

        //(4) Convert a string to uppercase and return .    Parameter (String) Return (String)
        Function<String,String> upperCase= str1-> str1.toUpperCase();
        System.out.println(upperCase.apply("microsoft"));
    }
}
