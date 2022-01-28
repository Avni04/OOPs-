package oopsconcept;

import java.util.concurrent.Callable;

public class RunTest {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        elephant.numberOfLegs();
        elephant.weight();

        Cat cat = new Cat();
        cat.numberOfLegs();
        cat.weight();
    }
}


