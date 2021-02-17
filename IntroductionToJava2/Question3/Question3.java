//  delete the .class of delete_class_after_compilation class
//  formed after compilation to get the  NoClassDefFoundError
class delete_class_after_compilation{
    void hello(){
        System.out.println("hello");
    }
}
public class Question3 {
    public static void main(String[] args) {
        delete_class_after_compilation obj=new delete_class_after_compilation();
        obj.hello();
    }
}