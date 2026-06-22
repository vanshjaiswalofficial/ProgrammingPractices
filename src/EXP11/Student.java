package EXP11;

import java.util.ArrayList;

public class Student {

    ArrayList<String> students = new ArrayList<>();

    void addStudents() {
        students.add("Rahul");
        students.add("Priya");
        students.add("Aman");
        students.add("Neha");
    }

    void displayStudents() {
        System.out.println("Students List:");

        for (String name : students) {
            System.out.println(name);
        }
    }
}