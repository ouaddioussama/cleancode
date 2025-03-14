package tptdd.fizzbuzz;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public  void testNumber(){
        assertEquals("1",FizzBuzz.convert(1));
        assertEquals("2",FizzBuzz.convert(2));
    }
    @Test
    public  void testFizz(){
        assertEquals("Fizz",FizzBuzz.convert(3));
        assertEquals("Fizz",FizzBuzz.convert(6));
    }

    @Test
    public  void testBuzz(){
        assertEquals("Buzz",FizzBuzz.convert(5));
        assertEquals("Buzz",FizzBuzz.convert(10));
    }


    @Test
    public  void testFizzBuzz(){
        assertEquals("FizzBuzz",FizzBuzz.convert(15));
        assertEquals("FizzBuzz",FizzBuzz.convert(30));
    }


}
