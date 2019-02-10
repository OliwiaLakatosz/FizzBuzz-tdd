package pl.edu.agh.mwo.fizzbuzz;

public class FizzBuzz {

    private int number = 0;

    public int getNumber() {
        return number;
    }

    public void fizzBuzz() {
        for (int i = 0; i < 100; i++) {
            number++;
        }
    }
}
