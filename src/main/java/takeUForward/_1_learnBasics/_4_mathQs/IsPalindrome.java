import takeUForward._1_learnBasics._4_mathQs.ReverseNumber;

boolean isPalindrome(int number) {
    return number == ReverseNumber.reversed(number);
}

void main() {
    int[] nums = {10, 8888, 662566, 67576, 5};

    for (int n : nums) {
        System.out.printf("The number %d is %s\n", n, isPalindrome(n)? "palindrome":"not palindrome");
    }
}