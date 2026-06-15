package takeUForward._11_GreedyAlg._2_MidHard;

/*
Problem Statement:
Given a list of job durations representing the time it takes to complete each job.
Implement the Shortest Job First algorithm to find the average waiting time for these jobs.
 */

import java.util.Arrays;

public class _7_ShortestJobFirst {
    static double sjf(int[] jobs) {
        Arrays.sort(jobs);

        double waitTime = 0, totalTime = 0;
        for (int job : jobs) {
            waitTime += totalTime;
            totalTime += job;
        }
        return waitTime / jobs.length;
    }

    static void testing(int[] jobs) {
        System.out.printf("Jobs: %s\nThe average waiting time for given jobs is: %f\n\n", Arrays.toString(jobs), sjf(jobs));
    }

    static void main() {
        int[][] jobMatrix = {
                {3, 1, 4, 2, 5},
                {4, 3, 7, 1, 2},
        };

        for (int[] jobs : jobMatrix)
            testing(jobs);
    }
}
