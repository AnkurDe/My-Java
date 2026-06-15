int[] bruteForce(int[] arr) {
    int[] result = new int[arr.length];
    int index = 0;

    for (int num : arr) {
        if (num != 0) {
            result[index++] = num;
        }
    }
    return result;
}

void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(bruteForce(nums)));
}