package BabyProjects;

import java.util.Arrays;

public class Chinese_Remainder {
    // Modular inverse using Extended Euclidean Algorithm
    public static int modInverse(int a, int b) {
        int b0 = b, t, q;
        int x0 = 0, x1 = 1;
        if (b == 1) return 1;
        while (a > 1) {
            q = a / b;
            t = b;
            b = a % b;
            a = t;
            t = x0;
            x0 = x1 - q * x0;
            x1 = t;
        }
        if (x1 < 0) x1 += b0;
        return x1;
    }

    // Normalize value modulo b
    public static int congr_mod(int a, int b) {
        return (a % b + b) % b;
    }

    public static int GCD(int x, int y) {
        // Ensure both numbers are non-negative
        x = Math.abs(x);
        y = Math.abs(y);

        // Apply the Euclidean algorithm
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static int CR(int[] a, int[] b, int s) {
        if (s == 1) {
            System.out.println("Only one element in the array");
            return a[0] % b[0];
        }

        // Check if moduli are pairwise coprime
        for (int i = 0; i < s; i++) {
            if (b[i] <= 1) {
                System.out.println("Moduli must be greater than 1.");
                return -1;
            }
            for (int j = i + 1; j < s; j++) {
                if (GCD(b[i], b[j]) != 1) {
                    System.out.println("Moduli are not pairwise coprime.");
                    return -1;
                }
            }
        }

        // Calculate N
        int N = Arrays.stream(b, 0, s).reduce(1, (a1, b1) -> a1 * b1);

        // Calculate n[i], m[i], and G
        int[] n = new int[s];
        int[] m = new int[s];
        int G = 0;
        for (int i = 0; i < s; i++) {
            n[i] = N / b[i];
            m[i] = modInverse(n[i], b[i]);
            G = (G + (a[i] * n[i] * m[i]) % N) % N;
        }
        return G;
    }

    public static void main(String[] args) {
        int s = 3;
        int[] a = {2, 3, 2};
        int[] b = {3, 5, 7};
        System.out.println(CR(a, b, s));
    }
}
