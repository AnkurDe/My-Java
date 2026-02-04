void revArray(int[] array, int leftPointer) {
    if (array.length / 2 > leftPointer)
        revArray(array, leftPointer +1);

    int temp = array[leftPointer];
    array[leftPointer]=array[array.length - leftPointer - 1];
    array[array.length - leftPointer - 1] = temp;
}

    void main() {
        int[] a = {1,2,3,4,5};
        revArray(a, 0);
        System.out.println(Arrays.toString(a));
    }