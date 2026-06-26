// Problem Statement: A thief needs to rob money in a street.
// The houses in the street are arranged in a circular manner.
// Therefore, the first and the last house are adjacent to each other.
// The security system in the street is such that if adjacent houses are robbed, the police will get notified.
//
// Given an array of integers "Arr" which represents money at each house, we need to return the maximum amount of money that the thief can rob without alerting the police.

int houseRobberRec(int[] arr) {
    int length = arr.length;

    if (length == 1) return arr[0];

    int prev = arr[0];
    int prev2 = 0;

    for (int i = 1; i < length; i++) {
        int pick = arr[i];
        if (i > 1) pick += prev2;
        int nonPick = prev;
        int curr_i = Math.max(pick, nonPick);
        prev2 = prev;
        prev = curr_i;
    }
    return prev;
}

int houseRobber(int[] arr) {
    if (arr.length == 0) return 0;
    if (arr.length == 1) return arr[0];

    int[] arr1 = new int[arr.length], arr2 = new int[arr.length - 1];

    for (int i = 0; i < arr.length; i++) {
        if (i != 0) arr1[i] = arr[i];
        if (i != arr.length -1) arr2[i] = arr2[i];
    }

    return Math.max(houseRobberRec(arr1), houseRobberRec(arr2));
}

void tester(int[] arr) {
    System.out.printf("The maximum money that can be stolen is: %d\n", houseRobber(arr));
}

void main() {
    int[][] moneys = {
            {2, 1, 4, 9},
            {1, 5, 2, 1, 6},
    };

    for (int[] money : moneys)
        tester(money);
}