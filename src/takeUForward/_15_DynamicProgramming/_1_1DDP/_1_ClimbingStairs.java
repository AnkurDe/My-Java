// Given a number of stairs. Starting from the 0th stair we need to climb to the “Nth” stair. At a time we can climb either one or two steps. We need to return the total number of distinct ways to reach from 0th to Nth stair.


// Looks very much like Fubbonacci problem
// Say you are on 10th step then your previous step could have been 2 steps or 1 step, Then in that 2 steps you might have made 2, 1 and so on and so forth

int numberOfStepsMemoization(int stairs) {
    int[] dp = new int[stairs + 1];

    dp[0] = 1;
    dp[1] = 1;
    for (int i = 2; i <= stairs; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[stairs];
}

int numberOfStepsTabulation(int stairs) {
    if (stairs == 0 || stairs == 1)
        return 1;

    int a = 1, b = 1, c = 0;
    for (int i = 1; i < stairs; i++) {
        c = a + b;
        a = b;
        b = c;
    }
    return c;
}

void testing(int stairs) {
    System.out.printf("The number of steps required are %d\n", numberOfStepsMemoization(stairs));
    System.out.printf("The number of steps required are %d\n\n", numberOfStepsTabulation(stairs));
}

void main() {
    int[] nums = {2, 3};
    for (int i : nums)
        testing(i);
}