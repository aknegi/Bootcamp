interface ArithmaticOperations {
    int opr(int x, int y);
}
public class Question3 {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int sub(int num1, int num2) {
        return num1 - num2;
    }
    static int mul(int num1, int num2) {
        return num1 * num2;
    }
    public static void main(String[] args) {
        int x = 4, y = 8;
        //Instance Reference
        Question3 obj = new Question3();
        ArithmaticOperations ref = obj::add;
        System.out.println("\nSum of " + x + " and " + y + " is: " + ref.opr(x, y));

        ArithmaticOperations reference1 = obj::sub;
        System.out.println("\nDifference of " + x + " and " + y + " is: " + reference1.opr(x, y));

        //Static Reference
        ArithmaticOperations reference2 = Question3::mul;
        System.out.println("\nProduct of " + x + " and " + y + " is: " + reference2.opr(x, y)); }
}
