int bruteForce(int number) {
    int i;
    for (i = 0; number > 0; i++) {
        number /= 10;
    }
    return i;
}

int optimalApproach(int number) {
    return (int) (Math.log10(number)+1);
}


void main() {
    int[] nums = {10, 4895165, 852566, 855};

    for (int n : nums) {
        System.out.printf("The number of digits in number %d are: %d --Brute-force\n", n, bruteForce(n));
        System.out.printf("The number of digits in number %d are: %d --Optimal\n", n, optimalApproach(n));
    }
}