int majorityElement(int[] nums) {
    int count = 0, element = 0;
    final int length = nums.length;
    for (final int el : nums) {
        if (count == 0) {
            count = 1;
            element = el;
        } else if (el == element) {
            ++count;
        } else {
            --count;
        }
    }

    int count1 = 0;
    for (final int num : nums) {
        if (num == element)
            count1++;
    }

    if (count1 > length/2)
        return element;
    else
        return -1;
}

void testing(int[] nums) {
    System.out.printf("The majority element in array %s is %d\n", Arrays.toString(nums), majorityElement(nums));
}

void main() {
    int[][] numsArr = new int[][]{
            {7, 0, 0, 1, 7, 7, 2, 7, 7},
            {1, 1, 1, 2, 1, 2},
            {3, 2, 3},
            {2, 2, 1, 1, 1, 2, 2},
    };
    for (int[] nums : numsArr)
        testing(nums);
}