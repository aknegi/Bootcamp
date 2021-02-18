import java.util.HashMap;
import java.util.Map;

public class Question3 {
    static void countUniqueChars(String str) {
        Map<Character, Integer> uniqeChars = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (!uniqeChars.containsKey(str.charAt(i))) {
                    uniqeChars.put(str.charAt(i), 1);
                } else {
                    uniqeChars.put(str.charAt(i), uniqeChars.get(str.charAt(i)) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : uniqeChars.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String inputString = "this is a string that contains multiple characters";
        countUniqueChars(inputString);
    }
}
