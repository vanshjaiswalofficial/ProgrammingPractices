package EXP10;

public class Test {

    public static void main(String[] args) {

        System.out.println(
                        "Experiment No. : 10\n" +
                        "Name : Vansh Jaiswal\n" +
                        "Enrollment No.: 0832CS241215\n" +
                        "Branch: CSE\n" +
                        "Section: C\n" +
                        "Semester: 4th\n"
        );

        Student s = new Student();

        System.out.println("First Division:");
        s.divide(20, 4);

        System.out.println("\nSecond Division:");
        s.divide(20, 0);
    }
}
