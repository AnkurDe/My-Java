public int ordinary(int a, int b){
    int g = 1;
    int min = Math.min(a, b);
    int i = 1;
    while (i <= min){
        if (a%i == 0 && b%i == 0)
            g=i;
        i++;
    }
    return g;
}

public int better(int a, int b){
    for (int i = Math.min(a, b); i >= 1; i--) {
        if (a%i == 0 && b%i == 0)
            return i;
    }
    return 1;
}

public int optimal(int a, int b){
    while(a > 0 && b > 0) {
            // If a is greater than b,
            // subtract b from a and update a
            if(a > b) {
                // Update a to the remainder
                // of a divided by b
                a = a % b;
            }
            // If b is greater than or equal
            // to a, subtract a from b and update b
            else {
                // Update b to the remainder
                // of b divided by a
                b = b % a;
            }
        }
        // Check if a becomes 0,
        // if so, return b as the GCD
        if(a == 0) {
            return b;
        }
        // If a is not 0,
        // return a as the GCD
        return a;
}

void main() {
    int a = 10, b = 30;
    System.out.printf("The gcd of %d and %d is: %d\n",a, b, ordinary(a, b));
    System.out.printf("The gcd of %d and %d is: %d\n",a, b, better(a, b));
    System.out.printf("The gcd of %d and %d is: %d\n",a, b, optimal(a, b));
}