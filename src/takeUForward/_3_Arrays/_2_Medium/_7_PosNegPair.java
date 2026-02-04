// Problem Statement:
// There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
// Without altering the relative order of positive and negative elements,
// you must return an array of alternately positive and negative values.

int[] bruteForce(int[] arr) {
    List<Integer> pos = new LinkedList<>();
    List<Integer> neg = new LinkedList<>();

    final int length = arr.length;
    int[] out = new int[length];
//    System.arraycopy(arr, 0, out, 0, arr.length);

    for (int element : out) {
        if (element > 0)
            pos.add(element);
        else
            neg.add(element);
    }

    for (int i = 0; i < length/2; i++) {
        out[i*2] = pos.removeFirst();
        out[i*2 + 1] = neg.removeFirst();
    }
    return out;
}

int[] optimal (int[] arr) {
    final int length = arr.length;
    int[] ret = new int[length];
    int pointerPos = 0, pointerNeg = 1;

    for (final int element : arr) {
        if (element > 0) {
            ret[pointerPos] = element;
            pointerPos+=2;
        } else {
            ret[pointerNeg] = element;
            pointerNeg+=2;
        }
    }

    return ret;
}

void testing(int[] arr) {
    System.out.println("Initial: " + Arrays.toString(arr));

    System.out.println("Brute Force: " + Arrays.toString(bruteForce(arr)));

    System.out.println("Optimal: " + Arrays.toString(optimal(arr)));
    System.out.println();
}

void main() {
    int[][] arrs = new int[][] {
            {3,1,-2,-5,2,-4},
            {-1,1},
            {1,-2,2,-5,3,-4},
            {1,2,-4,-5}
    };

    for (int[] arr : arrs)
        testing(arr);
}