class Employee {
    private String name;
    private int age;
    private String city;

    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

interface EmployeeInterface {
    public Employee emp(String name, int age, String city);
}

public class Question4 {
    public static void main(String[] args) {
        //Constructor Reference
        EmployeeInterface empInterface = Employee::new;

        Employee emp1 = empInterface.emp("Ram", 24, "Delhi");
        Employee emp2 = empInterface.emp("Shyam", 25, "Mumbai");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
    }
}


