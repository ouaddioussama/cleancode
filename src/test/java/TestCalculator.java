import org.junit.Assert;
import org.junit.Test;
import tptdd.Calculator;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    @Test
    public void testAddition() {
        Calculator calculator=new Calculator();
        assertEquals(5,calculator.add(2,3));
    }

}
