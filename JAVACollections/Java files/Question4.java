import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    private double age;
    private double salary;
    private String name;

    public Employee(double age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class SalarySorting implements Comparator<Employee> {
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.getSalary() > emp2.getSalary()) {
            return 1;
        } else if (emp1.getSalary() < emp2.getSalary()) {
            return -1;
        } else {
            return 0;
        }
    }
}
public class Question4 {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(34.0, 60000.0, "Ram"));
        employeeList.add(new Employee(28.0, 32000.0, "Shyam"));
        employeeList.add(new Employee(30.0, 40000.0, "Nakul"));
        employeeList.add(new Employee(25.0, 50000.0, "Krishna"));
        employeeList.add(new Employee(31.0, 42000.0, "Dhruv"));
        SalarySorting salarySorting = new SalarySorting();
        Collections.sort(employeeList, salarySorting);
        for (Employee i : employeeList)
            System.out.println(i.getSalary() + " " + i.getName() + " " + i.getAge());
    }
}
