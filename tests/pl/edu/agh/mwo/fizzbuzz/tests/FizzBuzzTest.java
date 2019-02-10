package pl.edu.agh.mwo.fizzbuzz.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.edu.agh.mwo.fizzbuzz.FizzBuzz;


public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @Before
    public void createFizzBuzzForTests() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void testIfCountToHundred() {
        fizzbuzz.fizzBuzz();
        int max = 100;
        int number = fizzbuzz.getNumber();
        Assert.assertEquals(max, number);
    }

    @Test
    public void testIfFizzWhenMultipleOfThree() {
        fizzbuzz.fizzBuzz();
        Assert.assertEquals(fizzbuzz.getFizzbuzzList().get(2), "Fizz");
    }
}
