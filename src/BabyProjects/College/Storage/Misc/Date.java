package BabyProjects.College.Storage.Misc;

public record Date(byte date, Month month, int year) {
    public enum Month {
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December;
    }

    public Date {
        if (date < 1)
            throw new IllegalArgumentException("Invalid date");

        if (month == Month.January || month == Month.March || month == Month.May || month == Month.July || month == Month.August || month == Month.October || month == Month.December) {
            if (date > 31) {
                throw new IllegalArgumentException("Invalid date");
            }
        }

        if (month == Month.April || month == Month.June || month == Month.September || month == Month.November) {
            if (date > 30) {
                throw new IllegalArgumentException("Invalid date");
            }
        }

        if (month == Month.February) {
            boolean isLeap = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
            if (isLeap && date > 29) {
                throw new IllegalArgumentException("Invalid date");
            } else if (date > 28) {
                throw new IllegalArgumentException("Invalid date");
            }
        }
    }

    private String dateSuffix() {
        if (date >= 11 && date <= 13) {
            return "th";
        }
        return switch (date % 10) {
            case 1 -> "st";
            case 2 -> "nd";
            case 3 -> "rd";
            default -> "th";
        };
    }

    @Override
    public String toString() {
        return date + dateSuffix() + " " + month + ", "  + year;
    }
}
