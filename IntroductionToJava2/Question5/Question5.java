class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(Employee oldObj) {
        this.id = oldObj.id;
        this.name = oldObj.name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
public class Question5 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Akshay");
        Employee emp2 = new Employee(emp1);
        System.out.println("id = "+emp2.getId()+", name = "+emp2.getName());
    }
}
