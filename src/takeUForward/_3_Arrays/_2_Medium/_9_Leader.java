int[] leaders(int[] arr) {
    List<Integer> list = new ArrayList<>();

    if (arr.length == 1)
        return arr;

    int element = arr[arr.length-1];
    list.add(element);

    for (int i = arr.length-2; i >= 0; i--) {
        final int el = arr[i];
        if (el > element) {
            list.add(el);
            element = el;
        }
    }

    final int length = list.size();
    int[] out = new int[length];
    for (int i=0; i<length;i++){
        out[i]=list.get(i);
    }
    return out;
}

void testing(int[] arr) {
    System.out.println("The original array");
    System.out.println(Arrays.toString(arr));

    System.out.println("Leader of array");
    System.out.println(Arrays.toString(leaders(arr)));
}

void main() {
    int[][] arrays = {
            {4, 7, 1, 0},
            {10, 22, 12, 3, 0, 6},
    };
    for (int[] arr : arrays)
        testing(arr);
}