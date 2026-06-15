package Baby_level._2objectsClasses;

public class _20a_Enums {
    private static enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        System.out.println(Day.MONDAY);

        Day day = Day.MONDAY;
        switch (day) {
            case SUNDAY -> System.out.println("Sunday");
            case MONDAY -> System.out.println("Monday");
            case TUESDAY -> System.out.println("Tuesday");
            case WEDNESDAY -> System.out.println("Wednesday");
            case THURSDAY -> System.out.println("Thursday");
            case FRIDAY -> System.out.println("Friday");
            case SATURDAY -> System.out.println("Saturday");
        }

        System.out.println("\n\nAll values in enum are");
        for (Day d : Day.values())
            System.out.println(d);
    }
}
