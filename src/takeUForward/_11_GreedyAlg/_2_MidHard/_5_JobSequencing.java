/*
Problem Statement:
You are given a set of N jobs where each job comes with a deadline and profit.
The profit can only be earned upon completing the job within its deadline.
Find the number of jobs done and the maximum profit that can be obtained.
Each job takes a single unit of time and only one job can be performed at a time.
 */

int[] jobProfit(int[][] jobs) {
    Arrays.sort(jobs, (a, b) -> Integer.compare(b[2], a[2]));
    int maxDeadline = 0;

    for (int[] j : jobs)
        maxDeadline = Math.max(maxDeadline, j[1]);

    // Slot for scheduling jobs
    int[] slot = new int[maxDeadline + 1];
    Arrays.fill(slot, -1);

    int countJobs = 0, totalProfit = 0;

    for (int[] job : jobs) {
        int id = job[0], deadline = job[1], profit = job[2];
        for (int t = deadline; t >= 1; t--) {
            if (slot[t] == -1) {
                slot[t] = id;
                countJobs++;
                totalProfit += profit;
                break;
            }
        }
    }
    return new int[]{countJobs, totalProfit};
}

void testing(int[][] job) {
    int[] ans = jobProfit(job);
    System.out.printf("The number of jobs can be done: %d, Profit earned: %d\n", ans[0], ans[1]);

}

void main() {
    int[][][] problems = {{
            // JobID, deadline, profit
            {1, 4, 20}, {2, 1, 10}, {3, 1, 40}, {4, 1, 30}}};

    for (int[][] problem : problems) {
        testing(problem);
    }
}
