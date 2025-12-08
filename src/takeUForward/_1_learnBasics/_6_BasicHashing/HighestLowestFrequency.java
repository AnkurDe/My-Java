void frequency(int[] arr, int n) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int ele : arr){
        map.put(ele, map.getOrDefault(ele, 0) + 1);
    }

    int maxFreq = 0, minFreq = Integer.MAX_VALUE, maxEle = 0, minEle = 0;

    for (Map.Entry<Integer, Integer> entry : map.entrySet()){
        int element = entry.getKey();
        int count = entry.getValue();

        if (count > maxFreq) {
            maxFreq = count;
            maxEle = element;
        }

        if (count < minFreq) {
            minFreq = count;
            minEle = element;
        }
    }
    System.out.printf("The maximum element is: %d, frequency: %d\n", maxEle, maxFreq);
    System.out.printf("The minimum element is: %d, frequency: %d\n", minEle, minFreq);
}

void main(String[] args) {
    int[] arr = {10, 5, 10, 15, 10, 5};
    System.out.println(Arrays.toString(arr));
    frequency(arr, arr.length);

    arr = new int[]{4, 6, 2, 6, 4, 6, 3, 2};
    System.out.println(Arrays.toString(arr));
    frequency(arr, arr.length);
}