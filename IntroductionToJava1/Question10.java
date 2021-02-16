
public class Question10 {

    public void overload(int num1, int num2,String operation ){
        int sum = num1+num2;
        System.out.println(operation+" of two integers is = "+ sum);
    }

    public void overload(double num1, double num2){
        double sum = num1+num2;
        System.out.println("Sum of two double primitive numbers is = "+ sum);
    }

    public void overload(float num1, float num2){
        float product = num1*num2;
        System.out.println("Multiplication of two float type numbers is = "+product);
    }

    public void overload(int num1, int num2){
        int product = num1*num2;
        System.out.println("Multiplication of two integers is = "+ product);
    }

    public void overload(String str1, String str2){
        String concatedStrings = str1+str2;
        System.out.println("Concatenation of two strings is : "+concatedStrings);
    }

    public void overload(String str1, String str2,String str3){
        String concatedStrings = str1+str2+str3;
        System.out.println("Concatenation of three strings is : "+concatedStrings);
    }

    public static void main(String[] args) {
        Question10 obj =new Question10();
        obj.overload(12,34);
        obj.overload(3.44,1.3);
        obj.overload(4345332.3223, 65.4545232238);
        obj.overload("Hello ", "Java");
        obj.overload("Hello ","Java " , "this is Intellij");
    }}