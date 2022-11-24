package ComparableImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{

    private String name;
    private Integer marks;

    public Student(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }

    public void print(){
        System.out.println(this.name+" -> "+this.marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("rancho", 45));
        students.add(new Student("chatur", 32));
        students.add(new Student("raju", 30));
        students.add(new Student("farhan", 28));
        students.add(new Student("virus", 32));
        students.add(new Student("joy", 45));


        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

    }

    /**
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Student o) {
        if(this.marks > o.marks)
            return -1;
        else if(this.marks < o.marks)
            return 1;
        else
            /*
            compareTo (to compare strings lexicographically)
            str1.compareTo(str2) -> +ve str1 comes first lexicographically
                                 -> -ve str2 comes second
                                 -> 0 str1 & str2 are equal string
             */
            if(this.name.compareTo(o.name) > 0)
                return 1;
            else
                return -1;
    }
}
