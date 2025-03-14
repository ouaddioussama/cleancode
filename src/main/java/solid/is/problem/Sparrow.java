package solid.is.problem;

import solid.is.Bird;

public class Sparrow implements Bird {
    @Override
    public void fly() {
        System.out.println("spparow fly");
    }

    @Override
    public void eat() {
        System.out.println("spparow eats");

    }
}
