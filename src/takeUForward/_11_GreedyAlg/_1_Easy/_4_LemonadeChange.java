//Problem Statement: Given an array representing a queue of customers and the value of bills they hold, determine if it is possible to provide correct change to each customer. Customers can only pay with 5$, 10$ or 20$ bills, and we initially do not have any change at hand. Return true, if it is possible to provide correct change for each customer otherwise return false.

boolean lemonadeChange(int[] bills) {
    int[] changes = new int[3]; // For 5, 10 and 15 dollars

    // Processing each bill
    for (final int bill : bills) {
        if (bill == 5) {
            changes[0]++;
        } else if (bill == 10) {
            if (changes[0] > 0) {
                changes[0]--;
                changes[1]++;
            } else {
                return false;
            }
        } else if (bill == 20) {
            if (changes[1] > 0 && changes[0] > 0) {
                changes[0]--;
                changes[1]--;
            } else if (changes[0] > 2) {
                changes[0] -= 3;
            } else {
                return false;
            }
        }
    }
    return true;
}

void testing(int[] bill) {
    System.out.printf("It is %spossible to give changes\n", lemonadeChange(bill) ? "" : "not ");
}

void main() {
    int[][] bills = {
            {5, 5, 5, 10, 20},
            {5, 5, 10, 10, 20},
    };

    for (int[] bill : bills)
        testing(bill);

}