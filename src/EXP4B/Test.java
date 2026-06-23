package EXP4B;

public class Test {

    public static void main(String[] args) {

        System.out.println(
                "Experiment No.: 4\n" +
                        "Name : Vansh Jaiswal\n" +
                        "Enrollment No.: 0832CS241215\n" +
                        "Branch: CSE\n" +
                        "Section: C\n" +
                        "Semester: 4th\n\n"
        );

        // Static method
        Vehicle.showCompany();

        // Object Creation
        Car c = new Car();

        // Final method
        c.showWheels();

        // Synchronized method
        c.startEngine();

        // Volatile variable
        System.out.println("Engine Status : " + c.engineOn);

        // Abstract method implementation
        c.display();

        // Native method is NOT called because it has no implementation.
        System.out.println("Native method declared successfully.");
    }
}