package BabyProjects.College.Storage.Misc;

public record Time(byte hours, byte minutes) {

    public Time {
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23.");
        }
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Minute must be between 0 and 59.");
        }
    }

    @Override
    public String toString() {
        return (hours/10 == 0 ? "0"+hours : hours) + ":" + (minutes/10 == 0 ? "0"+minutes : minutes);
    }
}
