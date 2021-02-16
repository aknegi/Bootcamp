public class Fourth {
    static void PercentageCal(String input) {
        int totalChar = input.length();
        int upperCaseChar = 0;
        int lowerCaseChar = 0;
        int digits = 0;
        int others = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCaseChar++;
            }
            else if (Character.isLowerCase(ch)) {
                lowerCaseChar++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else {
                others++;
            }
        }
        double upperCasePercentage = (upperCaseChar * 100) / totalChar;
        double lowerCasePercentage = (lowerCaseChar * 100) / totalChar;
        double digitsPercentage = (digits * 100) / totalChar;
        double otherPercentage = (others * 100) / totalChar;

        System.out.println("In '" + input + "' : ");
        System.out.printf("Uppercase letters are %d and percentage: %.0f%%\n",upperCaseChar,upperCasePercentage);
        System.out.printf("Lowercase letters are %d and percentage: %.0f%%\n",lowerCaseChar,lowerCasePercentage);
        System.out.printf("Digits are %d and percentage: %.0f%%\n",digits,digitsPercentage);
        System.out.printf("Other Characters are %d and percentage: %.0f%%\n",others,otherPercentage);
    }
    public static void main(String[] args) {
        String givenString="Let Us Calculate 100+24*34, and get The ANSWER";
        PercentageCal(givenString);
    }
}