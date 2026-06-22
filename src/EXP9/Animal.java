package EXP9;

public class Animal {

    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }

    void fetch() {
        System.out.println("Dog is fetching the ball.");
    }
}