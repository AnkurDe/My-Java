package takeUForward._1_learnBasics._2_Pattern;

public class Square {
    public static void star(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void number(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(cols+1);
            }
            System.out.println();
        }
    }
    
    public static void add(int rows, int cols) {
        int a = 0;
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(a++);
            }
            System.out.println();
        }
    }

    public static void window(int n) {
        assert (n>2);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < n-2; i++) {
            System.out.print("*");
            for (int j = 0; j <n-2 ; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        System.out.println("Square star pattern");
        star(4,5);
        System.out.println("Number pattern of square");
        number(4,5);
        System.out.println("Adding square pattern");
        add(3,3);

        System.out.println("Window pattern");
        window(10);
    }
}
