package EXP4B;

// Abstract class
abstract class Vehicle {

    // Static variable
    static String company = "TATA Motors";

    // Final variable
    final int wheels = 4;

    // Volatile variable
    volatile boolean engineOn = false;

    // Static method
    static void showCompany() {
        System.out.println("Company : " + company);
    }

    // Final method
    final void showWheels() {
        System.out.println("Number of Wheels : " + wheels);
    }

    // Synchronized method
    synchronized void startEngine() {
        engineOn = true;
        System.out.println("Engine Started Successfully.");
    }

    // Native method (Declaration only)
    native void gpsLocation();

    // Abstract method
    abstract void display();
}

// Child class
class Car extends Vehicle {

    @Override
    void display() {
        System.out.println("This is a Car.");
    }
}