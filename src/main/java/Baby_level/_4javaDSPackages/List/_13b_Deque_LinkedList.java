void main() {
    Deque<String> deque = new LinkedList<>();

    deque.add("Person 1");
    deque.add("Person 2");
    deque.add("Person 3");

    System.out.println("Queue: " + deque);

    System.out.println("Person removed: " + deque.poll());
    System.out.println(deque);
    System.out.println("Next person: " + deque.peek());

    deque.add("Person 4");
    deque.add("Person 5");
    deque.add("Person 6");

    System.out.println(deque);

    System.out.println("Last guy in queue: " + deque.peekLast());
    System.out.println("Removing last guy in queue: " + deque.pollLast());
    System.out.println(deque);
}