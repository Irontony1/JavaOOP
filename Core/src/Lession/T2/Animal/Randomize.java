package Lession.T2.Animal;

import java.util.Random;

public class Randomize {
    public static long longRate(long number) {
        Random randRate = new Random();
        return (long) (number * randRate.nextDouble(-0.25,0.26));
    }

    public static double doubleRate(double number) {
        Random randRate = new Random();
        return number * randRate.nextDouble(-0.25,0.26);
    }
}
