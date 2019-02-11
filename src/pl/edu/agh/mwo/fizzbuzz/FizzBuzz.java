package pl.edu.agh.mwo.fizzbuzz;

public class FizzBuzz {

    public String returnFizzBuzz(int number) {
            if (fizzbuzz(number) != null) {
                return fizzbuzz(number);
            } else if (fizz(number) != null) {
                return fizz(number);
            } else if (buzz(number) != null) {
                return buzz(number);
            }
        return Integer.toString(number);
    }

    private String fizzbuzz(int number) {
        if (fizz(number) != null && buzz(number) != null) {
            return "FizzBuzz";
        }
        return null;
    }

    private String fizz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return null;
    }

    private String buzz(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        }
        return null;
    }
}
