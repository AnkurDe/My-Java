List<List<Integer>> usingSet(int[] arr) {
    final int sum = 0;
    Set<Set<Integer>> superSet = new HashSet<>();
    List<List<Integer>> list = new ArrayList<>();
    Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());

    final int length = arr.length;
    Arrays.sort(arr);

    int left = 0, right = length - 1;

    while (left >= 0 && right <length && left < right) {
        final int le = arr[left], re = arr[right];
        final int guessedMe = sum - (le + re);
        if (set.contains(guessedMe)) {
//            superSet.add(new HashSet<>());
            list.add(Arrays.asList(le, guessedMe, re));
            right--;
            left++;
        } else {
            if (guessedMe < sum) {
                left++;
            } else {
                right--;
            }
        }
    }

    return list;
}

void testing(int[] arr) {
    System.out.printf("The elements summing to 0, are: %s\n", usingSet(arr));
}

void main() {
    int[][] arrays = new int[][]{
            {-1, 0, 1, 2, -1, -4},
            {-1, 0, 1, 0},
    };
    for (int[] arr : arrays)
        testing(arr);
}