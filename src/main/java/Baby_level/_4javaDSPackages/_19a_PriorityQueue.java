package Baby_level._4javaDSPackages;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _19a_PriorityQueue {
    public static void main(String[] args) {
        System.out.println("For min heap");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(1);
        minHeap.add(10);
        minHeap.add(2);
        minHeap.add(0);
        minHeap.add(7);
        System.out.println(minHeap);

        while (!minHeap.isEmpty())
            System.out.println("Polling: " + minHeap.poll());


        System.out.println("\n\n\nFor max heap");

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(1);
        maxHeap.add(10);
        maxHeap.add(2);
        maxHeap.add(0);
        maxHeap.add(7);
        System.out.println(maxHeap);

        while (!maxHeap.isEmpty())
            System.out.println("Polling: " + maxHeap.poll());
    }
}
