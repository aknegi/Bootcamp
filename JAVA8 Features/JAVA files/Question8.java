interface TestInterface1 {
    default void show() {
        System.out.println("\nDefault TestInterface1");
    }
}

interface TestInterface2 {
    default void show() {
        System.out.println("\nDefault TestInterface2");
    }
}

class Test implements TestInterface1, TestInterface2 {
    public void show() {
        TestInterface1.super.show();
        TestInterface2.super.show();
    }
}

public class Question8 {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.show();
    }
}