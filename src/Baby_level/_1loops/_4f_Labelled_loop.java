package Baby_level._1loops;

public class _4f_Labelled_loop {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    break outerLoop;
                }
                System.out.println(i + ", " + j);
            }
        }
    }
}
