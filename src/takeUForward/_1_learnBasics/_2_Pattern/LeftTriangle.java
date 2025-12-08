package takeUForward._1_learnBasics._2_Pattern;

public class LeftTriangle {
    private interface LT {
        void star(int cols);

        void colNum(int cols);

        void rowNum(int cols);

        void patt01(int cols);

        void incLett(int cols);
    }

    public static class Upper implements LT {
        @Override
        public void star(int cols) {
            for (int i = cols; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        @Override
        public void colNum(int cols) {
            for (int i = cols; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(j + 1);
                }
                System.out.println();
            }
        }

        @Override
        public void rowNum(int cols) {
            int temp = 1;
            for (int i = cols; i >= 0; i--, temp++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(temp);
                }
                System.out.println();
            }
        }

        @Override
        public void patt01(int cols) {
            for (int i = cols; i > 0; i--) {
                boolean b = i % 2 != 0;
                for (int j = 0; j < i; j++) {
                    System.out.print(b ? "1" : "0");
                    b = !b;
                }
                System.out.println();
            }
        }

        @Override
        public void incLett(int rows) {
            for (int i = rows; i >= 1; i--) {
                char c = 'A';
                for (int j = 0; j < i; j++, c = (char) (int) ++c) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }

    public static class Lower implements LT {
        @Override
        public void star(int cols) {
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        @Override
        public void colNum(int cols) {
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(j + 1);
                }
                System.out.println();
            }
        }

        @Override
        public void rowNum(int cols) {
            int temp = 1;
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(temp);
                }
                ++temp;
                System.out.println();
            }
        }

        @Override
        public void patt01(int cols) {
            for (int i = 0; i < cols; i++) {
                boolean b = i % 2 != 0;
                for (int j = 0; j <= i; j++) {
                    System.out.print(b ? "1" : "0");
                    b = !b;
                }
                System.out.println();
            }
        }

        public void incNumSum(int rows) {
            int k = 1;
            for (int i = 1; i <= rows; i++) {
                for (int j = 0; j < i; j++, k++) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }

        @Override
        public void incLett(int rows) {
            for (int i = 1; i <= rows; i++) {
                char c = 'A';
                for (int j = 0; j < i; j++, c = (char) (int) ++c) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }

        public void alphaRampPatt(int rows) {
            char c = 'A';
            for (int i = 0; i < rows; i++, c = (char) (int) ++c) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Upper upper = new Upper();
        Lower lower = new Lower();

        System.out.println("Star Upper Triangle pattern");
        upper.star(4);
        System.out.println("Star Lower Triangle pattern");
        lower.star(4);

        System.out.println("Column Number Upper Triangle pattern");
        upper.colNum(4);
        System.out.println("Column Number Lower Triangle pattern");
        lower.colNum(4);

        System.out.println("Row Number Upper Triangle pattern");
        upper.rowNum(4);
        System.out.println("Row Number Lower Triangle pattern");
        lower.rowNum(4);

        System.out.println("Row Number Upper Triangle pattern");
        upper.rowNum(4);
        System.out.println("Row Number Lower Triangle pattern");
        lower.rowNum(4);

        System.out.println("01 Upper Triangle pattern");
        upper.patt01(4);
        System.out.println("01 Lower Triangle pattern");
        lower.patt01(4);

        System.out.println("Increasing number sum pattern");
        lower.incNumSum(5);

        System.out.println("Increasing Letter Lower triangle pattern");
        lower.incLett(5);
        System.out.println("Increasing Letter Upper triangle pattern");
        upper.incLett(5);

        System.out.println("Alpha ramp pattern");
        lower.alphaRampPatt(5);
    }
}
