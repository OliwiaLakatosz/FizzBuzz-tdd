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
        Assert.assertEquals("Fizz", fizzbuzz.getFizzbuzzList().get(2));
        Assert.assertEquals("Fizz", fizzbuzz.getFizzbuzzList().get(5));
        Assert.assertEquals("Fizz", fizzbuzz.getFizzbuzzList().get(8));
        Assert.assertEquals("Fizz", fizzbuzz.getFizzbuzzList().get(11));
    }

    @Test
    public void testIfBuzzWhenMultipleOfFive() {
        fizzbuzz.fizzBuzz();
        Assert.assertEquals("Buzz", fizzbuzz.getFizzbuzzList().get(4));
        Assert.assertEquals("Buzz", fizzbuzz.getFizzbuzzList().get(19));
        Assert.assertEquals("Buzz", fizzbuzz.getFizzbuzzList().get(49));
    }
}
