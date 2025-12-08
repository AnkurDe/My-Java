package BabyProjects.PatientManagementSystem;

public class Disease {
    private final String date, name;
    private final double temp, sugar;

    public Disease(String date, String name, double temp, double sugar){
        this.date = date;
        this.name = name;
        this.temp = temp;
        this.sugar = sugar;
    }

    public String getDate() {
        return date;
    }

    public double getTemp() {
        return temp;
    }

    public double getSugar() {
        return sugar;
    }

    public String getName() {
        return name;
    }
}
