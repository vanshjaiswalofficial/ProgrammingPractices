package EXP8;

public class Test
{
    public static void main(String[] args)
    {
        System.out.println(
                "Experiment No.: 8\n" +
                        "Name : Vansh Jaiswal\n" +
                        "Enrollment No.: 0832CS241215\n" +
                        "Branch: CSE\n" +
                        "Section: C\n" +
                        "Semester: 4th\n"
        );

        InterfaceDemo obj = new InterfaceDemo();

        obj.display();
        obj.academicMarks();
        obj.sportsMarks();
    }
}