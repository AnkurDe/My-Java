import java.util.*;

void bucketSort(float[] arr) {
    if (arr == null || arr.length == 0)
        return;

    int n = arr.length;

    List<Float>[] buckets = new ArrayList[n];
    for (int i = 0; i < n; i++) {
        buckets[i] = new ArrayList<>();
    }

    for (float value : arr) {
        int bucketIndex = (int) (value * n);
        buckets[bucketIndex].add(value);
    }

    for (int i = 0; i < n; i++) {
        Collections.sort(buckets[i]);
    }

    int index = 0;
    for (int i = 0; i < n; i++) {
        for (float value : buckets[i]) {
            arr[index++] = value;
        }
    }
}

void main() {
    float[] data = {0.42f, 0.32f, 0.33f, 0.52f, 0.37f, 0.47f, 0.51f};
    System.out.println("Before sorting: " + Arrays.toString(data));
    bucketSort(data);
    System.out.println("After sorting:  " + Arrays.toString(data));
}