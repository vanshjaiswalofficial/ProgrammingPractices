package EXP13;

public class Test {

    public static void main(String[] args) {

        System.out.println(
                        "Experiment No. : 13\n" +
                        "Name : Vansh Jaiswal\n" +
                        "Enrollment No.: 0832CS241215\n" +
                        "Branch: CSE\n" +
                        "Section: C\n" +
                        "Semester: 4th\n"
        );

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> {
            account.withdraw("Aman", 700);
        });

        Thread t2 = new Thread(() -> {
            account.withdraw("Rahul", 500);
        });

        t1.start();
        t2.start();
    }
}