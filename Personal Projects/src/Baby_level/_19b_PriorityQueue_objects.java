package Baby_level;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _19b_PriorityQueue_objects {
    private static class Task {
        String name;
        int priority;

        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return name + " (priority " + priority + ")";
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Task> pq = new PriorityQueue<>(Comparator.comparingInt(t -> t.priority));
        // Higher number high priority
        pq.add(new Task("Do work of high priority", 3));
        pq.add(new Task("Do work of low priority", 1));
        pq.add(new Task("Do work of medium priority", 2));

        while (!pq.isEmpty())
            System.out.println(pq.poll());
    }
}
