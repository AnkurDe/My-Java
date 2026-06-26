int[] twoPointer(int[] arr1, int[] arr2) {
    List<Integer> list = new ArrayList<>();
    int pt1 = 0, pt2 = 0;
    Integer prev = null;
    while (pt1 < arr1.length && pt2 < arr2.length) {
        int temp;

        if (arr1[pt1] < arr2[pt2]) {
            temp = arr1[pt1];
            pt1++;
        } else if (arr2[pt2] < arr1[pt1]) {
            temp = arr2[pt2];
            pt2++;
        } else {
            temp = arr1[pt1];
            pt1++;
            pt2++;
        }
        if (prev != null && temp == prev)
            continue;
        prev = temp;
        list.add(temp);
    }

    prev = null;

    while (pt1 < arr1.length) {
        final int temp = arr1[pt1];
        pt1++;
        if (prev != null && temp == prev)
            continue;
        list.add(temp);
        prev = temp;
    }

    while (pt2 < arr2.length) {
        final int temp = arr2[pt2];
        pt2++;
        if (prev != null && prev == temp)
            continue;
        list.add(temp);
        prev = temp;
    }

    int[] arr = new int[list.size()];
    int index = 0;

    for (int e : list)
        arr[index++] = e;

    return arr;
}

int[] unionSet(int[] arr1, int[] arr2) {
    Set<Integer> set = new HashSet<>();
    for (int e : arr1)
        set.add(e);
    for (int e : arr2)
        set.add(e);

    int index = 0;
    int[] arr = new int[set.size()];

    for (int e : set)
        arr[index++] = e;

    return arr;
}


void main() {
    int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
    System.out.printf("Arr1: %s\nArr2: %s\n", Arrays.toString(arr1), Arrays.toString(arr2));
    System.out.println(Arrays.toString(unionSet(arr1, arr2)));
    System.out.println(Arrays.toString(twoPointer(arr1, arr2)));
}