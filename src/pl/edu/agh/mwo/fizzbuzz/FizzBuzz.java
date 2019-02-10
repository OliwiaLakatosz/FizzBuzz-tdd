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

    public void fizzBuzz() {
        for (int i = 1; i < 100; i++) {
            if (fizz(i) != null) {
                fizzbuzzList.add(fizz(i));
            } else {
                fizzbuzzList.add(Integer.toString(i));
            }
            number++;
        }
    }

    private String fizz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return null;
    }
}
