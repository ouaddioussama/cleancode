package tptdd.fizzbuzz;

public class FizzBuzz {

    public static String convert(int inputNumber) {

        String result="";
         if(inputNumber%3==0)
              result+="Fizz";
         if(inputNumber%5==0)
            result+="Buzz";

       return result.isEmpty()?String.valueOf(inputNumber):result;

    }
}
