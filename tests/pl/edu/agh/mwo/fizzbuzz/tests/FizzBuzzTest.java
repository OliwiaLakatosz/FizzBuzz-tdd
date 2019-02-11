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
    public void testCheckIfNumberDivisibleByThreeReturnsFizz() {
        Assert.assertEquals("Fizz", fizzbuzz.returnFizzBuzz(3));
        Assert.assertEquals("Fizz", fizzbuzz.returnFizzBuzz(9));
        Assert.assertEquals("Fizz", fizzbuzz.returnFizzBuzz(27));
        Assert.assertEquals("Fizz", fizzbuzz.returnFizzBuzz(99));
        Assert.assertEquals("Fizz", fizzbuzz.returnFizzBuzz(18));
        Assert.assertEquals("Fizz", fizzbuzz.returnFizzBuzz(33));
    }

    @Test
    public void testCheckIfNumberDivisibleByFiveReturnsBuzz() {
        Assert.assertEquals("Buzz", fizzbuzz.returnFizzBuzz(5));
        Assert.assertEquals("Buzz", fizzbuzz.returnFizzBuzz(95));
        Assert.assertEquals("Buzz", fizzbuzz.returnFizzBuzz(10));
        Assert.assertEquals("Buzz", fizzbuzz.returnFizzBuzz(50));
        Assert.assertEquals("Buzz", fizzbuzz.returnFizzBuzz(25));
    }

    @Test
    public void testCheckIfNumberDivisibleByFiveAndThreeReturnsFizzBuzz() {
        Assert.assertEquals("FizzBuzz", fizzbuzz.returnFizzBuzz(15));
        Assert.assertEquals("FizzBuzz", fizzbuzz.returnFizzBuzz(75));

    }
}
