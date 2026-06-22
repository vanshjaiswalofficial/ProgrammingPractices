package EXP10;

public class Student {

    void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}