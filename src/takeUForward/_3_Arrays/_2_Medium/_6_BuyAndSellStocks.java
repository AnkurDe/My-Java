// Problem Statement:
// You are given an array of prices where prices[i] is the price of a given stock on an ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.


// Wrong Implementation
//int buySell(int[] prices) {
//    int min = prices[0], minPos = 0;
//    final int length = prices.length;
//
//    for (int i = 0; i < length-1; i++) {
//        int element = prices[i];
//        if (min >= element) {
//            min = element;
//            minPos = i;
//        }
//    }
//
//    int diff = 0;
//
//    for (int i = minPos; i < length; i++) {
//        int temp = prices[i] - min;
//        if (diff < temp)
//            diff = temp;
//    }
//    return diff;
//}


// Better implementation
int buySell(int[] prices) {
    int min = Integer.MAX_VALUE, max = 0;

    for (final int element : prices) {
        // Update min price
        if (min > element)
            min = element;

        if (max < element - min)
            max = element - min;
    }

    return max;
}

void testing(int[] arr) {
    System.out.printf("Prices: %s\nMaximum profit by buy-sell is: %d\n\n", Arrays.toString(arr), buySell(arr));
}

void main() {
    int[][] numsArr = new int[][]{
            {7, 1, 5, 3, 6, 4},
            {7, 6, 4, 3, 1},
            {2, 4, 1},
            {1},
            {5, 4, -1, 7, 8}
    };

    for (int[] nums : numsArr)
        testing(nums);
}
