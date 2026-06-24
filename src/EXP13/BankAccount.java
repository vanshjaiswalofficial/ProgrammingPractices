package EXP13;

class BankAccount {

    private int balance = 1000;

    // Synchronized method
    synchronized void withdraw(String name, int amount) {

        if (balance >= amount) {
            System.out.println(name + " is withdrawing Rs." + amount);

            balance = balance - amount;

            System.out.println("Remaining Balance = Rs." + balance);
        } else {
            System.out.println(name + " - Insufficient Balance");
        }
    }
}