class Employees implements Cloneable {
    int id;
    String name;
    Employees(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Question5b {
    public static void main(String args[]){
        try {
            Employees emp1 = new Employees(101, "akshay");
            Employees emp2 = (Employees) emp1.clone();
            System.out.println(emp1.id + " " + emp1.name);
            System.out.println(emp2.id + " " + emp2.name);
        } catch (CloneNotSupportedException c) {
        }

    }
}


