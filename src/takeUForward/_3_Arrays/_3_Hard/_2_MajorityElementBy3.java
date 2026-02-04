Set<Integer> usingHashMap(int[] arr) {
    final int n = arr.length / 3;
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    for (final int ele : arr)
        hashMap.put(ele, hashMap.getOrDefault(ele, 0) + 1);


    Set<Integer> set = new HashSet<>();
    for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
        final int key = entry.getKey();
        final int value = entry.getValue();
        if (value > n)
            set.add(key);
    }

    return set;
}

Set<Integer> optimal(int[] arr) {
    Set set = new HashSet<>();

    int ele1 = 0, ele2 = 0, cnt1 = 0, cnt2 = 0;

    for (int element : arr) {
        if (ele1 == 0 && cnt1 == 0) {
//            element;
        }
    }

    return set;
}


void testing(int[] arr) {
    System.out.printf("The array given is: %s\nMajority elements are: %s\n\n", Arrays.toString(arr), usingHashMap(arr));
    System.out.printf("The array given is: %s\nMajority elements are: %s\n\n", Arrays.toString(arr), optimal(arr));
}

void main() {
    testing(new int[]{3, 2, 3});
}