// Problem Statement: The weight of N items and their corresponding values are given. We have to put these items in a knapsack of weight W such that the total value obtained is maximized.


int fractionalKnapsack(int[] values, int[] weights, int capacity) {
    int[][] mat = new int[values.length][2];
    for (int i = 0; i < values.length; i++) {
        mat[i][0] = values[i];
        mat[i][1] = weights[i];
    }

    Arrays.sort(mat, Comparator.comparingInt(a -> -(a[0] / a[1]))); // Sorting by value / weight i.e. per unit cost in descending order

    int totalPrice = 0, totalWeight = 0;

    for (int i = 0; i < mat.length && totalWeight < capacity; i++) {
        final int value = mat[i][0],
                weight = mat[i][1],
                toBeFilled = capacity - totalWeight;

        if (toBeFilled > weight) {
            totalWeight += weight;
            totalPrice += value;
        } else {
            final double perUnit = 1.0 * value / weight;
            totalWeight += toBeFilled;
            totalPrice += (int) (toBeFilled * perUnit);
        }
    }
    return totalPrice;
}

void testing(int[] values, int[] weights, int capacity) {
    System.out.printf("The total profit using Fractional Knapsack is %d\n", fractionalKnapsack(values, weights, capacity));
}

void main() {
    int[][] values = {
            {60, 100, 120},
            {60, 100}
    };

    int[][] weights = {
            {10, 20, 30},
            {10, 20}
    };

    int[] capacities = {50, 50};

    for (int i = 0; i < values.length; i++) {
        testing(values[i], weights[i], capacities[i]);
    }

}