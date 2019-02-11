package pl.edu.agh.mwo.fizzbuzz;

public class Run {

    public static void main (String[] args) {
        FizzBuzz fb = new FizzBuzz();

        for (int i = 1; i < 101; i++) {
            System.out.println(fb.returnFizzBuzz(i));
        }
    }
}

