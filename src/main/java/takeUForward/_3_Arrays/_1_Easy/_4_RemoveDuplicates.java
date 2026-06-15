int[] brute_force(int[] arr) {
    Set<Integer> set = new HashSet<>();
    for (int e : arr)
        set.add(e);
    arr = new int[set.size()];

    int i = 0;
    for (int e : set) {
        arr[i] = e;
        ++i;
    }
    return arr;
}

int[] optimal(int[] arr) {
    int prev = arr[0];
    int left = 1;
    for (int right = 1; right < arr.length; right++) {
        if (prev != arr[right]) {
            arr[left] = arr[right];
            prev=arr[left];
            ++left;
        }
    }

    int[] temp = new int[left];
    System.arraycopy(arr, 0, temp, 0, left);
    return temp;
}

void main() {
    int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    System.out.println(Arrays.toString(nums1));

    int[] nums2 = nums1.clone();
    nums2 = brute_force(nums2);
    System.out.println(Arrays.toString(nums2));

    int[] nums3 = nums1.clone();
    nums3 = optimal(nums3);
    System.out.println(Arrays.toString(nums3));
}