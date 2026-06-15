int better(int[] arr) {
    if (arr == null || arr.length == 0)
        return 0;
    int len = 1, curr = 1;

    Arrays.sort(arr);
    int prev = arr[0];
    for (int i = 1; i < arr.length; i++) {
        final int element = arr[i];

        if (prev + 1 == element) {
            curr++;
        } else {
            curr = 1;
        }

        len = Math.max(len, curr);

        prev = element;
    }

    return len;
}

int optimal(int[] arr) {
    if (arr == null || arr.length == 0)
        return 0;
    if (arr.length == 1)
        return 1;

    Set<Integer> set = new HashSet<>();

    for (int element : arr)
        set.add(element);

    int longest = 1;

    for (int num : set) {
        if (!set.contains(num - 1)) {
            int current = num;
            int length = 1;

            while (set.contains((current + 1))) {
                current++;
                length++;
            }
            longest = Math.max(longest, length);
        }
    }

    return longest;
}

void testing(int[] arr) {
    System.out.printf("Array: %s, consecutive integers: %d --better\n", Arrays.toString(arr), better(arr));
    System.out.printf("Array: %s, consecutive integers: %d --optimal\n\n", Arrays.toString(arr), optimal(arr));
}

void main() {
    int[][] arrays = {
            {100, 4, 200, 1, 3, 2},
            {0, 3, 7, 2, 5, 8, 4, 6, 0, 1},
            {1, 0, 1, 2}
    };

    for (int[] arr : arrays)
        testing(arr);
}