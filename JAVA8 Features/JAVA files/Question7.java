interface NewInterface {
    default void default_method() {
        System.out.println("This is default_method of NewInterface");
    }
}

class MyClass implements NewInterface {

    @Override
    public void default_method() {
        System.out.println("This is default_method of MyClass ");
    }
}

public class Question7 {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.default_method();
    }
}

