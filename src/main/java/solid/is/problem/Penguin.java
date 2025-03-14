package solid.is.problem;

import solid.is.Bird;

//ne respecte pas IS
public class Penguin implements Bird {

    @Override
    public void fly() {
       throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}
