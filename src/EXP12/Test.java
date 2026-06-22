package EXP12;

public class Test {

    public static void main(String[] args) {

        System.out.println(
                        "Experiment No. : 12\n" +
                        "Name : Vansh Jaiswal\n" +
                        "Enrollment No.: 0832CS241215\n" +
                        "Branch: CSE\n" +
                        "Section: C\n" +
                        "Semester: 4th\n"
        );

        // Thread class
        PrinterThread t1 = new PrinterThread();

        // Runnable interface
        ScannerTask task = new ScannerTask();
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}