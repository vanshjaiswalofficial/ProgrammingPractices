package EXP7;

public class Test
{
    public static void main(String[] args)
    {
        System.out.println(
                "Experiment No.: 7\n" +
                        "Name : Vansh Jaiswal\n" +
                        "Enrollment No.: 0832CS241215\n" +
                        "Branch: CSE\n" +
                        "Section: C\n" +
                        "Semester: 4th"
        );

        System.out.println("\nSingle & Multilevel Inheritance");
        Result obj1 = new Result();
        obj1.showPerson();
        obj1.showStudent();
        obj1.showResult();

        System.out.println("\nHierarchical Inheritance");
        Employee obj2 = new Employee();
        obj2.showPerson();
        obj2.showEmployee();
    }
}