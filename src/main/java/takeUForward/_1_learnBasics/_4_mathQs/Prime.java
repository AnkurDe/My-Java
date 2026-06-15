boolean bruteforce(int number){
    for (int i = 2; i < number; i++) {
        if (number % i == 0)
            return false;
    }
    return true;
}

boolean optimal(int number) {
    for (int i = 2; i*i < number; i++) {
        if (number % i == 0)
            return false;
    }
    return true;
}

void main() {
    int[] nums = {10, 51, 662566, 19, 5};

    for (int n : nums) {
        System.out.printf("--Brute The number %d is %s\n", n, bruteforce(n) ? "prime" : "not prime");
        System.out.printf("--Optim The number %d is %s\n", n, optimal(n) ? "prime" : "not prime");
    }
}