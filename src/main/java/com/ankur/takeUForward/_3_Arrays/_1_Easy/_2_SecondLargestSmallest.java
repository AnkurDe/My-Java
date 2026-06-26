// Given an array, find the second smallest and second-largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

int[] brute_force(int[] arr) {
    int[] temp = {-1, -1}; // 2nd Smallest, 2nd Largest

    if (arr.length < 2) {
        return temp;
    }

    int[] tempArr = arr.clone();
    Arrays.sort(tempArr);
    int smallest = tempArr[0];
    int largest = tempArr[arr.length - 1];

    // Taking 2nd smallest
    for (int i = 1; i < arr.length; i++) {
        if (tempArr[i] > smallest) {
            temp[0] = tempArr[i];
            break;
        }
    }

    // Taking 2nd Largest
    for (int i = arr.length - 2; i > 0; i--) {
        if (tempArr[i] < largest) {
            temp[1] = tempArr[i];
            break;
        }
    }
    return temp;
}

int[] better(int[] arr) {
    int[] temp = {-1, -1};

    if (arr.length < 2) {
        return temp;
    }

    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    for (int j : arr) {
        if (j < smallest)
            smallest = j;
        if (j > largest)
            largest = j;
    }

    int secondLargest = Integer.MIN_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    for (int j : arr) {
        if (j > secondLargest && j < largest)
            secondLargest = j;
        if (j < secondSmallest && j > smallest)
            secondSmallest = j;
    }

    if (secondSmallest != Integer.MAX_VALUE)
        temp[0] = secondSmallest;
    if (secondLargest != Integer.MIN_VALUE)
        temp[1] = secondLargest;

    return temp;
}

int[] optimal(int[] arr) {
    int[] temp = {-1, -1};

    if (arr.length < 2)
        return temp;

    int largest = Integer.MIN_VALUE,
            secondLargest = Integer.MIN_VALUE,
            smallest = Integer.MAX_VALUE,
            secondSmallest = Integer.MAX_VALUE;


    for (int j : arr) {
        // largest
        if (j > largest) {
            secondLargest = largest;
            largest = j;
        } else if (j < largest && j > secondLargest) {
            secondLargest = j;
        }

        // smallest
        if (j < smallest) {
            secondSmallest = smallest;
            smallest = j;
        } else if (j < secondSmallest && j > smallest) {
            secondSmallest = j;
        }
    }

    if (secondSmallest != Integer.MAX_VALUE)
        temp[0] = secondSmallest;
    if (secondLargest != Integer.MIN_VALUE)
        temp[1] = secondLargest;

    return temp;
}

void main() {
    int[] arr = {10, 11, 5, -8, 7, 4, 8, 9, 3};
//    int[] arr = {5, 5, 5};
    System.out.println(Arrays.toString(arr));
    System.out.println("Largest and smallest element by bruteforce is: " + Arrays.toString(brute_force(arr)));
    System.out.println("largest and smallest element by better approach is: " + Arrays.toString(better(arr)));
    System.out.println("largest element by optimal approach is: " + Arrays.toString(optimal(arr)));
}