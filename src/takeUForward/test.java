package takeUForward;

public class test {
    public static void main(String[] args) {
        String a = null;
        try {
            try {
                System.out.println(a.length());
            } catch (Exception e) {
                throw new RuntimeException("Some shit happened");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}