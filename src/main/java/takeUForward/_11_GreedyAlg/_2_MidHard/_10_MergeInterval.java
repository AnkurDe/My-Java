/**
 * Problem Statement:
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals and return an array of the non-overlapping intervals that cover all the intervals in the input.
 *
 * @param list
 * @return
 */

List<List<Integer>> mergeIntervals(List<List<Integer>> list) {
    list.sort(Comparator.comparingInt(List::getFirst));
    List<Integer> earlier = list.getFirst();
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 1; i < list.size(); i++) {
        final List<Integer> thisOne = list.get(i);
        if (earlier.get(1) >= thisOne.getFirst()) {
            earlier.set(1, thisOne.get(1));
        } else {
            result.add(earlier);
            earlier = thisOne;
        }
    }
    result.add(earlier);
    return result;
}

void testing(List<List<Integer>> list) {
    System.out.printf("The merged list is %s\n", mergeIntervals(list));
}

void main() {
    testing(Arrays.asList(
            Arrays.asList(1, 3),
            Arrays.asList(2, 6),
            Arrays.asList(8, 10),
            Arrays.asList(15, 18)
    ));

    testing(Arrays.asList(
            Arrays.asList(1, 4),
            Arrays.asList(4, 5)
    ));

    testing(Arrays.asList(
            Arrays.asList(4, 7),
            Arrays.asList(1, 4)
    ));
}