package EXP9;

public class Test {

    public static void main(String[] args) {

        System.out.println(
                        "Experiment No. : 9\n" +
                        "Name : Vansh Jaiswal\n" +
                        "Enrollment No.: 0832CS241215\n" +
                        "Branch: CSE\n" +
                        "Section: C\n" +
                        "Semester: 4th\n"
        );

        // Upcasting
        Animal a = new Dog();
        System.out.println("=== Upcasting ===");
        a.sound();

        // Downcasting
        System.out.println("\n=== Downcasting ===");
        Dog d = (Dog) a;
        d.sound();
        d.fetch();
    }
}