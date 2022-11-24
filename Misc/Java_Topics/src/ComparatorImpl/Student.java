package ComparatorImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("rancho", 45));
        students.add(new Student("chatur", 32));
        students.add(new Student("raju", 30));
        students.add(new Student("farhan", 28));
        students.add(new Student("virus", 32));
        students.add(new Student("joy", 45));

        ComparatorCls comparatorCls = new ComparatorCls();
        System.out.println(students);
        Collections.sort(students, comparatorCls);
        System.out.println(students);

    }

}
