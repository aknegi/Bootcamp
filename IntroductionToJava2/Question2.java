public class Question2 {
    static void sortString(char[] charsOfInpString) {

        int start = 0;
        int next = 0;
        char temp = 0;

        for (start = 0; start < charsOfInpString.length; start++) {
            for (next = start + 1; next < charsOfInpString.length; next++) {
                if (charsOfInpString[start] > charsOfInpString[next]) {
                    temp = charsOfInpString[start];
                    charsOfInpString[start] = charsOfInpString[next];
                    charsOfInpString[next] = temp;
                }
            }
        }
    }

    static void displayString(char[] charsOfInpString) {
        int start = 0;
        for (start = 0; start < charsOfInpString.length; start++) {
            System.out.print(charsOfInpString[start]);
        }
    }

    public static void main(String[] args) {
        String inpString = "we Need to Sort this string";
        inpString = inpString.toLowerCase();
        char charsOfInpString[] = inpString.toCharArray();
        sortString(charsOfInpString);
        displayString(charsOfInpString);


    }
}
