int fibonacci(int number) {
    if (number <= 1) {
        return number;
    }

    final int last = fibonacci(number - 1);
    final int first = fibonacci(number - 2);

    return last + first;
}

void main() {
    int n = 3;
    System.out.printf("The sum of %d natural numbers is: %d\n", n, fibonacci(n));
}