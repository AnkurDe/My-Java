int countSubarraysWithSumK(final int[] array, final int k) {
    Map<Integer, Integer> prefixCount = new HashMap<>();
    prefixCount.put(0, 1);

    int prefixSum = 0;
    int count = 0;

    for (int ele : array) {
        prefixSum += ele;
        count += prefixCount.getOrDefault(prefixSum-k, 0);
        prefixCount.put(prefixSum, prefixCount.getOrDefault(prefixSum, 0) + 1);
    }
    return count;
}

void testing(int[] arr, int k) {
    System.out.println("Array: " + Arrays.toString(arr));
    System.out.println("Number of subarrays found: " +
            countSubarraysWithSumK(arr, k));
    System.out.println();
}

void main() {
    int[][] arrs = {
        {3, 1, 2, 4},
        {1, 2, 3}
    };
    int[] ks = {6, 3};

    for (int i = 0; i < ks.length; i++) {
        testing(arrs[i], ks[i]);
    }
}
