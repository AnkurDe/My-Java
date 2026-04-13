//Given an array of N integers, your task is to find unique quads that add up to give a target value. In short, you need to return an array of all the unique quadruplets [arr[a], arr[b], arr[c], arr[d]] such that their sum is equal to a given target.
//Note: a, b, c and d are also distinct and lies between 0 to n-1 (both inclusive).

List<List<Integer>> _4SumProblem(int[] arr, int target) {
    Arrays.sort(arr);
    List<List<Integer>> arrays = new ArrayList<>();
    final int length = arr.length;

    for (int i = 0; i < length; i++) {
        if (i > 0 && arr[i] == arr[i - 1])
            continue;

        for (int j = i + 1; j < length; j++) {
            if (j > i + 1 && arr[j] == arr[j - 1])
                continue;

            int left = j, right = length - 1;
            while (left < right) {
                final int sum = arr[i] + arr[j] + arr[left] + arr[right];

                if (sum == target) {
                    arrays.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                    while (left < right && arr[left] == arr[left + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right--;

                    left++;
                    right--;

                } else if (sum < target) left++;
                else right--;
            }
        }
    }

    return arrays;
}

String matrixToString(int[][] matrix) {
    StringBuilder sb = new StringBuilder();
    for (int[] arr : matrix)
        sb.append(Arrays.toString(arr)).append(",\n");
    return sb.toString();
}

void testing(int[] arr, int target) {
    System.out.printf("The numbers adding to %d is %s\n", target, _4SumProblem(arr, target).toString());
}

void main() {
    final int[][] matrix = {
            {1, 0, -1, 0, -2, 2},
            {4, 3, 3, 4, 4, 2, 1, 2, 1, 1},
    };

    final int[] targets = {0, 9};

    for (int i = 0; i < Math.min(matrix.length, targets.length); i++) {
        testing(matrix[i], targets[i]);
    }
}
