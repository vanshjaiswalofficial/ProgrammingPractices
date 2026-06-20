package EXP5;

public class Test
{
    public static void main(String[] args)
    {
        System.out.println(
                "Experiment No.: 5\n" +
                        "Name : Vansh Jaiswal\n" +
                        "Enrollment No.: 0832CS241215\n" +
                        "Branch: CSE\n" +
                        "Section: C\n" +
                        "Semester: 4th\n"
        );

        // Constructor Demonstration
        Address a1 = new Address("Indore");
        Student s1 = new Student(101, "Vansh", a1);

        // Shallow Copy
        Student shallowCopy = s1;

        // Deep Copy
        Student deepCopy = new Student(s1);

        // Modify Original Object
        s1.address.city = "Bhopal";

        System.out.println("\nOriginal Object");
        s1.display();

        System.out.println("\nShallow Copy Object");
        shallowCopy.display();

        System.out.println("\nDeep Copy Object");
        deepCopy.display();

        // Singleton Pattern
        System.out.println("\nSingleton Pattern");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2)
        {
            System.out.println("Both references point to same object");
        }
    }
}