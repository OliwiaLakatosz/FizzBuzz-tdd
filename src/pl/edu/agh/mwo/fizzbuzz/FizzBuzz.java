package pl.edu.agh.mwo.fizzbuzz;

import java.util.ArrayList;

public class FizzBuzz {

    private int number = 1;
    private ArrayList<String> fizzbuzzList = new ArrayList<>();

    public int getNumber() {
        return number;
    }

    public ArrayList<String> getFizzbuzzList() {
        return fizzbuzzList;
    }

    public void checkForFizzBuzz() {
        for (int i = 1; i < 100; i++) {
            if (fizzbuzz(i) != null) {
                fizzbuzzList.add(fizzbuzz(i));
            } else if (fizz(i) != null) {
                fizzbuzzList.add(fizz(i));
            } else if (buzz(i) != null){
                fizzbuzzList.add(buzz(i));
            }
             else {
                fizzbuzzList.add(Integer.toString(i));
            }
            number++;
        }
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
