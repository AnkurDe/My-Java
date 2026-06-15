int[] bySet(int[] arr, int k) {
    Set<Integer> set = new HashSet<>();

    for (int j : arr) {
        set.add(j);
    }

    for (int element : set) {
        if (set.contains(k - element) && element != k - element)
            return new int[]{element, k - element};
    }
    return null;
}

int[] bySorting(int[] arr, int k) {
    final int length = arr.length;

    int[][] numsWithIndex = new int[length][2]; // Element, index
    for (int i = 0; i < length; i++) {
        numsWithIndex[i][0] = arr[i];
        numsWithIndex[i][1] = i;
    }
    Arrays.sort(numsWithIndex, Comparator.comparingInt(a -> a[0]));

    int left = 0, right = length-1;
    while (left < right) {
        final int sum = numsWithIndex[left][0] + numsWithIndex[right][0];

        if (sum == k)
            return new int[] {numsWithIndex[left][1], numsWithIndex[right][1]};
        else if (sum<k) {
            ++left;
        } else {
            --right;
        }
    }
    return null;
}

void testing(int[] arr, int k) {
    System.out.printf("Elements adding upto number are %s --By Map\n", Arrays.toString(bySet(arr, k)));
    System.out.printf("Index of elements adding upto number are %s --By Sorting\n\n", Arrays.toString(bySorting(arr, k)));
}

void main() {
    int[] arr = new int[]{2, 6, 5, 8, 11};
    testing(arr, 14);

    arr = new int[]{2, 6, 5, 8, 11};
    testing(arr, 15);

    arr = new int[]{2, 6, 5, 8, 11};
    testing(arr, 14);

}