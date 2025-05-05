package fun_exchange;
import java.util.*;

public class test{

    public static void main(String[] args) {
        double growthRate = 0.005; // Example growth rate

        // Example historical crash data
        double[] crashPoints = {2.45, 1.85, 5.12, 3.67, 7.89};

        System.out.println("Round\tCrash Multiplier\tTime to 2x (ms)\tTime to 3x (ms)\tCrash Time (ms)");

        for (int round = 0; round < crashPoints.length; round++) {
            double crashMultiplier = crashPoints[round];

            double timeTo2x = Math.log(2) / growthRate;
            double timeTo3x = Math.log(3) / growthRate;
            double timeToCrash = Math.log(crashMultiplier) / growthRate;

            System.out.printf("%d\t%.2fx\t\t\t%.1f ms\t\t%.1f ms\t\t%.1f ms\n",
                round + 1, crashMultiplier, timeTo2x, timeTo3x, timeToCrash);
        }
    }
}

