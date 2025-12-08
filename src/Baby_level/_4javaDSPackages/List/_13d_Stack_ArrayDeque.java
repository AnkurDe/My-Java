void main() {
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.println(stack);

    System.out.println("Peek from stack: "+stack.peek());
    System.out.println("Popped from stack: " + stack.pop());
}
