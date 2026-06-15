int sqrt(int x) {
    if (x < 2)
        return x;

    int left = 1, right = x / 2, result = 0;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (mid <= x / mid) {
            result = mid;
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return result;
}

void testing(int number) {
    System.out.printf("The square root is %d --Our function\n", sqrt(number));
    System.out.printf("The square root is %d --Standard\n\n", (int) Math.sqrt(number));
}

void main() {
    testing(10);
    testing(100);
    testing(20);
    testing(80);
    testing(60000);
    testing(69629);
    testing(95258565);
}