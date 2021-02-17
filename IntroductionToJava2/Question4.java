class Singleton {
    private static Singleton obj;
    private int count = 1;

    private Singleton() {
        System.out.println("The only object is created");
    }

    public static synchronized Singleton getInstance() {
        if (obj == null)
            obj = new Singleton();
        return obj;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance(); //this will not create any new object

    }
}
