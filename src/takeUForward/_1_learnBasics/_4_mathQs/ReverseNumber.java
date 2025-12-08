package takeUForward._1_learnBasics._4_mathQs;

public class ReverseNumber {
    public static int reversed(int number) {
        int num = 0;
        while (number > 0) {
            num *= 10;
            num += number % 10;
            number /= 10;
        }
        return num;
    }

    void main() {
        int[] nums = {10, 4895165, 852566, 855};

        for (int n : nums) {
            System.out.printf("The reverse number %d is: %d --Brute-force\n", n, reversed(n));
        }
    }
}