void forward(int current, int number) {
    if (current > number)
        return;

    System.out.print(current + " ");
    forward(current + 1, number);
}

    public void backward(int current, int n) {
        if (current > n)
            return;
        backward(current + 1, n);
        System.out.print(current + " ");
    }

void main() {
    System.out.print("Forward: ");
    forward(1, 3);
    System.out.print("\nBackward: ");
    backward(1, 3);
}