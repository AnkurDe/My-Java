int largest_brute_force(int[] arr) {
    int[] tempArr = arr.clone();
    Arrays.sort(tempArr);
    return tempArr[0];
}

int largest_optimal(int[] arr) {
    int temp = Integer.MIN_VALUE;
    for (int e : arr) {
        if (e > temp)
            temp = e;
    }
    return temp;
}

void main() {
    int[] arr = {10, 11, 5, -8, 7, 4, 8, 9, 3};
    System.out.println(Arrays.toString(arr));
    System.out.println("Largest element by bruteforce is: " + largest_brute_force(arr));
    System.out.println("largest element by optimal is: " + largest_optimal(arr));
}