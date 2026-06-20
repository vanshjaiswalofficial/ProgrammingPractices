package EXP3;

public class Test
{
    public static void main(String[] args)
    {
        System.out.println(
                "Experiment No.: 3\n" +
                        "Name : Vansh Jaiswal\n" +
                        "Enrollment No.: 0832CS241215\n" +
                        "Branch: CSE\n" +
                        "Section: C\n" +
                        "Semester: 4th\n\n"
        );

        Student obj1 = new Student();
        Student obj2 = new Student();

        obj1.getData(101, "Sachin");
        obj2.getData(102, "Rahul");

        obj1.display();
        obj2.display();
    }
}