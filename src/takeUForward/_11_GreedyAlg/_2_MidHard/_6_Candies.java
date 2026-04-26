package takeUForward._11_GreedyAlg._2_MidHard;

/*
Problem Statement:
A line of N kids is standing there.
The rating values listed in the integer array ratings are assigned to each kid.
These kids are receiving candy according to the following criteria:

    There must be at least one candy for every child.
    Kids whose scores are higher than their neighbors receive more candies than their neighbors.

Return the minimum number of candies needed to distribute among children.
 */

import Baby_level._2objectsClasses._6_Variable_Arguements;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class _6_Candies {
    public static int candyAllocation(int[] ratings) {
        final int n = ratings.length;
        int totCandies = n;
        if (n > 1 && ratings[0] > ratings[1])
            totCandies++;

        int child = 1;

        while (child < n) {
            if (ratings[child] == ratings[child - 1]) {
                child++;
                continue;
            }

            int increasing = 0;
            while (child < n && ratings[child] > ratings[child - 1]) {
                increasing++;
                totCandies += increasing;
                child++;
            }

            int decreasing = 0;
            while (child < n && ratings[child] < ratings[child - 1]) {
                decreasing++;
                child++;
            }
            totCandies -= Math.min(increasing, decreasing);
        }

        return totCandies;
    }

    public static int candyAllocationArr(int[] ratings) {
        final int n = ratings.length;
        int[] alloc = new int[n];
        Arrays.fill(alloc, 1);

        for (int child = 1; child < n; child++) {
            if (ratings[child] > ratings[child - 1])
                alloc[child] = alloc[child - 1] + 1;
        }

        for (int child = n-2; child >= 0; child--) {
            if (ratings[child] > ratings[child + 1])
                alloc[child] = Math.max(alloc[child], alloc[child + 1] + 1);
        }

        return Arrays.stream(alloc).sum();
    }

    public static void tester(int[] ratings) {
        System.out.printf("The minimum number of candies required is: %s\n", candyAllocationArr(ratings));
    }

    static void main() {
        int[][] ratingsArr = {
                {1, 0, 5},
                {1, 2, 2},
        };

        for (int[] rating : ratingsArr)
            tester(rating);
    }
}
