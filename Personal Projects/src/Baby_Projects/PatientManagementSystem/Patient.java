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
//        for (Disease d : details){
//            double sl = Math.abs(d.sugar - disease.sugar);
//            double temp = Math.abs(d.temp - disease.temp);
//            if (sl<0.5 || temp < 0.5 || disease.name.equals(d.name) || disease.date.equals(d.date)){
//                throw new DuplicateException();
//            }
//        }
//        details.add(disease);

        for (int i = 0; i < details.size(); i++){
            double sl = Math.abs(details.get(i).sugar - disease.sugar);
            double temp = Math.abs(details.get(i).temp - disease.temp);
            if (sl<0.5 || temp < 0.5 || disease.name.equals(details.get(i).name) || disease.date.equals(details.get(i).date)){
                throw new DuplicateException();
            }
        }
        details.add(disease);
    }

    void display(){
        for (Disease d : details){
            System.out.println(d.date + " "+ d.name + " " + d.sugar + " " + d.temp);
        }
    }
}
