void main() {
    Stack<Integer> stack = new Stack<>();

    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println(stack);

    System.out.println("Popped element: " + stack.pop());
    System.out.println(stack);

    System.out.println("Peeking element: " + stack.peek());

    System.out.println("The stack is " + (stack.isEmpty() ? "empty" : "not empty"));


    stack.pop();
    stack.pop();
    System.out.println("The stack is " + (stack.isEmpty() ? "empty" : "not empty"));
}