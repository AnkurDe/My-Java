int maximumConsecutive1s(int[] arr) {
    int max = 0;
    int currentCount = 0;
    Integer prev = null;

    for (int ele : arr) {
        if (ele == 1) {
            if (prev == null || prev == 0)
                currentCount = 1;
            else
                currentCount++;
        } else {
            if (prev != null && prev == 1) {
                max=Math.max(currentCount, max);
            }
        }
        prev = ele;
    }
    return Math.max(max, currentCount);
}

void testing(int[] arr) {
    System.out.printf("The maximum consecutive 1s are %d\n", maximumConsecutive1s(arr));
}

void main() {
    int[] arr = {1, 1, 0, 1, 1, 1};
    testing(arr);
    arr = new int[] {1, 0, 1, 1, 0, 1};
    testing(arr);
}