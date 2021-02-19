
interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default method");
    }

    static void staticMethod() {
        System.out.println("Static method");
    }
}

public class Question6 implements MyInterface {

    public static void main(String[] args) {

        Question6 obj = new Question6();
        obj.defaultMethod();
        MyInterface.staticMethod();
    }
}

