package takeUForward._1_learnBasics._2_Pattern;

public class EqTriangle {
    public static void upper(int rows) {
        assert rows > 0;
        int spaces = 2 * rows - 1;
        int k = 1;
        for (int i = 1; i <= spaces; i += 2, k++) {
            for (int j = 0; j < rows - k; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void lower(int rows) {
        assert rows > 0;
        int spaces = 2 * rows - 1;
        int k = 0;
        for (int i = spaces; i >= 1; i -= 2, k++) {
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void upperLower(int rows) {
        if (rows == 1) {
            System.out.println("*");
            return;
        }
        upper(rows);
        lower(rows);
    }

    public static void left(int nums) {
        new LeftTriangle.Lower().star(nums - 1);
        for (int i = 0; i < nums; i++) {
            System.out.print("*");
        }
        System.out.println();
        new LeftTriangle.Upper().star(nums - 1);
    }
    
    public static void numberCrown(int nums) {
        for (int i = 1; i <= nums; i++) {
            //Left side numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Spaces
            for (int j = 0; j < (nums-i)*2; j++) {
                System.out.print(" ");
            }

            // Right side spaces
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Prints star ^ pattern triangle");
        upper(5);
        
        System.out.println("Prints star v pattern triangle");
        lower(5);
        
        System.out.println("Diamond upper and lower");
        upperLower(5);
        
        System.out.println("Left upper and lower");
        left(5);

        System.out.println("Numeber crown");
        numberCrown(5);
    }
}
