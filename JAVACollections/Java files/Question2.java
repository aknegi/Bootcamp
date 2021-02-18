import java.util.HashSet;
import java.util.Set;

public class Question2 {
    static int countUniqueChars(String str) {
        int count = 0;
        Set<Character> uniqeChars = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                uniqeChars.add(str.charAt(i));
            }
        }
        return uniqeChars.size();
    }

    public static void main(String[] args) {
        String inputString = "this is a string that contains multiple characters";
        System.out.println(countUniqueChars(inputString));
    }
}
