package BabyProjects.College.Storage.enums;

public enum Campus {
    Amritapuri("AM"),
    Amaravati(null),
    Bengaluru("BL"),
    Chennai(null),
    Coimbatore("CB"),
    Faridabad(null),
    Kochi(null),
    Mysuru(null),
    Nagercoil(null),
    Haridwar(null);

    public final String shortForm;

    Campus(String shortForm){
        this.shortForm = shortForm;
    }
}
