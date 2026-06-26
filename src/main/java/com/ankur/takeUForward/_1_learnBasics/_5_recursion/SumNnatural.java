int sum(int number) {
    if (number > 1)
        return number + sum(number - 1);
    return 1;
}

void main() {
    int n = 8;
    System.out.printf("The sum of %d natural numbers is: %d\n", n, sum(n));
}