package Baby_Projects.PatientManagementSystem;

import java.util.ArrayList;

public class Patient {
    ArrayList<Disease> details;
    public Patient (){
        details = new ArrayList<>();
    }

    void insert (Disease disease) throws DuplicateException {
        if (details.isEmpty()) {
            details.add(disease);
            return;
        }
        for (Disease d : details){
            double sl = Math.abs(d.getSugar() - disease.getSugar());
            double temp = Math.abs(d.getTemp() - disease.getTemp());
            if (sl<0.5 || temp < 0.5 || disease.getName().equals(d.getName()) || disease.getDate().equals(d.getDate())){
                throw new DuplicateException();
            }
        }
        details.add(disease);
    }

    void display(){
        for (Disease d : details){
            System.out.println(d.getDate() + " "+ d.getName() + " " + d.getSugar() + " " + d.getTemp());
        }
    }
}
