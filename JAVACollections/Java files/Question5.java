import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private String Name;
    private double Score;
    private double Age;

    public Student(String name, double score, double age) {
        Name = name;
        Score = score;
        Age = age;
    }
    public String getName() {
        return Name;
    }
    public double getScore() {
        return Score;
    }
    public double getAge() {
        return Age;
    }
}

class ScoreSorting implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getAge() > s2.getAge()) {
            return 1;
        } else if (s1.getAge() < s2.getAge()) {
            return -1;
        } else {
            return s1.getName().compareTo(s2.getName());
        }
    }
}
public class Question5 {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Adarsh Singh", 89.0, 16.0));
        studentList.add(new Student("Nakul Kumar", 90.0, 16.0));
        studentList.add(new Student("Aman Sharma", 70.0, 17.0));
        studentList.add(new Student("Mehul kohli", 89.0, 16.0));
        studentList.add(new Student("Akriti Dhoni", 90.0, 17.0));

        ScoreSorting scoreSort = new ScoreSorting();
        Collections.sort(studentList, scoreSort);
        for (Student s : studentList) {
            System.out.println("Age: "+s.getAge() + ", Name: " + s.getName()+", Score: "+s.getScore());
        }
    }
}
