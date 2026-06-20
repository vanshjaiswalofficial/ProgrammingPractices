package EXP6;

public class Test
{
    public static void main(String[]args)
    {
        System.out.println(
                        "Experiment No.: 6\n" +
                        "Name : Vansh Jaiswal\n" +
                        "Enrollment No.: 0832CS241215\n" +
                        "Branch: CSE\n" +
                        "Section: C\n" +
                        "Semester: 4th\n"
        );
        GarbageDemo g1 = new GarbageDemo(101);
        GarbageDemo g2 = new GarbageDemo(102);

        g1.display();
        g2.display();

        g1 = null;
        g2 = null;

        System.out.println("Requesting Garbage Collection ...");
        System.gc();
        System.out.println("Program End");
    }
}
