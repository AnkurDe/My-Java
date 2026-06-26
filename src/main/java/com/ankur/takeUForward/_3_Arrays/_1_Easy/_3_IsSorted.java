boolean brute_force(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[i])
                return false;
        }
    }
    return true;
}

boolean optimal(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        if (arr[i - 1] > arr[i])
            return false;
    }
    return true;
}

void checker(int[] arr) {
    System.out.println(Arrays.toString(arr));
    System.out.println("It is " + (brute_force(arr) ? "sorted" : "not sorted") + " --BruteForce");
    System.out.println("It is " + (optimal(arr) ? "sorted" : "not sorted") + " --Optimal method\n");
}

void main() {
    checker(new int[]{5, 5, 5});
    checker(new int[]{5});
    checker(new int[]{1, 2, 3});
    checker(new int[]{3, 5, 5});
    checker(new int[]{5, 7, 1});
}