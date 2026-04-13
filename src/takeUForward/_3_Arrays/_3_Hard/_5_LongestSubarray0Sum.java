//Problem Statement: Given an array containing both positive and negative integers, we have to find the length of the longest subarray with the sum of all elements equal to zero.


int _0Sum(int[] arr) {
    final int length = arr.length;
    int maxi = 0;
    HashMap<Integer, Integer> map = new HashMap<>();


    return maxi;

}

void testing(int[] arr) {
    System.out.printf("The array is %s, longest subarray with sum 0 is %d\n", Arrays.toString(arr), _0Sum(arr));
}


void main() {
    int[][] matrix = {
            {9, -3, 3, -1, 6, -5},
            {6, -2, 2, -8, 1, 7, 4, -10}
    };

    for (int[] arr : matrix) {
        testing(arr);
    }
}
