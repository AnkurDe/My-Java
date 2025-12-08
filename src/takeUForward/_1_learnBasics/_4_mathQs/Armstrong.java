public boolean isArmstrong(int number) {
    int sum = 0;
    int digits = (int) (Math.log10(number) + 1);
    int num = number;

    while (num > 0) {
        int ld = num % 10;
        sum += (int) Math.pow(ld, digits);
        num /= 10;
    }

    return sum == number;
}

void main() {
    int[] nums = {10, 153, 371, 67576, 5};

    for (int n : nums) {
        System.out.printf("The number %d is %s\n", n, isArmstrong(n) ? "armstrong" : "not armstrong");
    }
}