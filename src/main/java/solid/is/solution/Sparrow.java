package solid.is.solution;

public class Sparrow implements Flyingbird,EatingBird{
    @Override
    public void eat() {
        System.out.println("Sparrow eating ");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flies ");

    }
}
