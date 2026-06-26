List<List<Integer>> triangle(final int numRows) {
    List<List<Integer>> list = new ArrayList<>();

    list.add(List.of(1));

    if (numRows == 1) {
        return list;
    }

    for (int i = 1; i < numRows; i++) {
        List<Integer> prev = list.get(i-1);
        List<Integer> curr = new ArrayList<>();

        curr.add(1);
        for (int j = 1; j < prev.size(); j++) {
            curr.add(prev.get(j-1) + prev.get(j));
        }
        curr.add(1);
        list.add(curr);
    }

    return list;
}

void testing(int num) {
    System.out.printf("Pascals triangle for %d is \n", num);
    List<List<Integer>> list = triangle(num);
    for (final List<Integer> li : list)
        System.out.println(li);
    System.out.println();
}

void main() {
    int[] arr = {1, 2, 3, 5, 10};
    for (int ele : arr)
        testing(ele);
}