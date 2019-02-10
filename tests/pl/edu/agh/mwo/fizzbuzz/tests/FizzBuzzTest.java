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
        fizzbuzz.checkForFizzBuzz();
        int max = 100;
        int number = fizzbuzz.getNumber();
        Assert.assertEquals(max, number);
    }

    @Test
    public void testIfFizzWhenMultipleOfThree() {
        fizzbuzz.checkForFizzBuzz();
        Assert.assertEquals("Fizz", fizzbuzz.getFizzbuzzList().get(2));
        Assert.assertEquals("Fizz", fizzbuzz.getFizzbuzzList().get(5));
        Assert.assertEquals("Fizz", fizzbuzz.getFizzbuzzList().get(8));
        Assert.assertEquals("Fizz", fizzbuzz.getFizzbuzzList().get(11));
    }

    @Test
    public void testIfBuzzWhenMultipleOfFive() {
        fizzbuzz.checkForFizzBuzz();
        Assert.assertEquals("Buzz", fizzbuzz.getFizzbuzzList().get(4));
        Assert.assertEquals("Buzz", fizzbuzz.getFizzbuzzList().get(19));
        Assert.assertEquals("Buzz", fizzbuzz.getFizzbuzzList().get(49));
    }

    @Test
    public void testIfFizzBuzz() {
        fizzbuzz.checkForFizzBuzz();
        Assert.assertEquals("FizzBuzz", fizzbuzz.getFizzbuzzList().get(14));
    }
}
