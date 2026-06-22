package EXP11;

public class Test {

    public static void main(String[] args) {

        System.out.println(
                        "Experiment No. : 11\n" +
                        "Name : Vansh Jaiswal\n" +
                        "Enrollment No.: 0832CS241215\n" +
                        "Branch: CSE\n" +
                        "Section: C\n" +
                        "Semester: 4th\n"
        );

        Student s = new Student();

        s.addStudents();
        s.displayStudents();
    }
}