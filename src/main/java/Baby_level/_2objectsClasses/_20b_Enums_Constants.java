package Baby_level._2objectsClasses;

public class _20b_Enums_Constants {
    private enum People {
        Ankur(24105),
        Karthikeya(24146),
        Pavitra(24137),
        Jiya(24123);

        public final int roll;
        People(int roll) {
            this.roll = roll;
        }
    }
    public static void main(String[] args) {
        System.out.println(People.Pavitra.roll);
        for (People p : People.values())
            System.out.println(p);
    }
}
