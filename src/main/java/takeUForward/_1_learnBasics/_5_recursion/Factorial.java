int factorial(int number) {
    if (number > 1)
        return number * factorial(number - 1);
    return 1;
}

void main() {
    int[] nums = {1, 2, 3, 4, 10};

    for (int n : nums) {
        System.out.printf("The factorial of number %d is %d\n", n, factorial(n));
    }
}