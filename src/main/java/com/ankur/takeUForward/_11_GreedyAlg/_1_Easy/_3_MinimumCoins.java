// Given an integer array of coins representing coins of different denominations and an integer amount representing a total amount of money.
// Return the fewest number of coins that are needed to make up that amount.
// If that amount of money cannot be made up by any combination of the coins, return -1.
// There are infinite numbers of coins of each type

int minCoins(int[] coins, int amount) {
    Arrays.sort(coins);
    int noCoins = 0;

    for (int i = coins.length -1; i >= 0; i--) {
        int temp = amount / coins[i];
        noCoins += temp;
        amount -= temp * coins[i];
    }

    return (amount == 0) ? noCoins : -1;
}

void tester(int[] coins, int amount) {
    System.out.printf("For coins %s the number of coins required are: %d\n", Arrays.toString(coins), minCoins(coins, amount));
}

void main() {
    int[][] coinsArr = {
            {1, 2, 5},
            {2, 5}
    };
    int[] targets = {11, 3};

    for (int i = 0; i < coinsArr.length; i++) {
        tester(coinsArr[i], targets[i]);
    }
}