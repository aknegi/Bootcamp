import java.util.Scanner;

public class Question8 {
    static boolean checkChars(String str) {
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner inpObj = new Scanner(System.in);
        String inpString = null;

        // do while loop
        System.out.println("By do while loop");
        do {
            inpString = inpObj.next();
            if (checkChars(inpString)) {
                System.out.println("first and last characters of this string are same");
            }
        }
        while (!inpString.equals("done"));

        //while loop
        System.out.println("By while loop");
        inpString = "";
        while (!inpString.equals("done")) {
            inpString = inpObj.next();
            if (checkChars(inpString)) {
                System.out.println("first and last characters of this string are same");
            }
        }
    }
}
