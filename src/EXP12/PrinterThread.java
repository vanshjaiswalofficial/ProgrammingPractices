package EXP12;

// Thread Class
class PrinterThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Class : Printing Page " + i);
        }
    }
}

// Runnable Interface
class ScannerTask implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Interface : Scanning Page " + i);
        }
    }
}