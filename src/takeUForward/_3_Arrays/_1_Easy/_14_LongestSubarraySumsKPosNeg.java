int longestSubArr(int[] arr, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int prefixSum = 0;
    int maxLength = 0;

    for (int i = 0; i < arr.length; i++) {
        prefixSum += arr[i];

        if (prefixSum == k)
            maxLength = i + 1;

        if (map.containsKey(prefixSum - k)) {
            int length = i - map.get(prefixSum - k);
            maxLength = Math.max(maxLength, length);
        }

        map.putIfAbsent(prefixSum,i);
    }

    return maxLength;
}

void main() {
    int[] arr = {1, -1, 5, -2, 3};
    System.out.printf("");
}