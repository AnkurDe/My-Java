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
    final int length = arr.length;
    int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE, cnt1 = 0, cnt2 = 0;

    for (int element : arr) {
        if (ele1 == 0 && ele2 != element) {
            cnt1 = 1;
            ele1 = element;
        } else if (cnt2 == 0 && ele1 != element) {
            cnt2 = 1;
            ele2 = element;
        } else if (element == ele1) {
            cnt1++;
        } else if (element == ele2) {
            cnt2++;
        } else {
            cnt1--;
            cnt2--;
        }


    }

    cnt1 = 0;
    cnt2 = 0;
    for (int element : arr) {
        if (element == ele1)
            cnt1++;
        else
            cnt2++;
    }

    int minimum = length / 3 + 1;
    Set<Integer> set = new HashSet<>();

    if (cnt1 >= minimum) set.add(ele1);
    if (cnt2 >= minimum) set.add(ele2);

    return set;
}


void testing(int[] arr) {
    System.out.printf("The array given is: %s\nMajority elements are: %s\n\n", Arrays.toString(arr), usingHashMap(arr));
    System.out.printf("The array given is: %s\nMajority elements are: %s\n\n", Arrays.toString(arr), optimal(arr));
}

void main() {
    testing(new int[]{3, 2, 3});
}