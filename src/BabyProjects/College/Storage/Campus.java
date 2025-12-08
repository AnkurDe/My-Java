package BabyProjects.College.Storage;

import BabyProjects.College.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.EnumMap;

// Class of a campus
public class Campus implements Stor<School> {
    final public static class Event {
        final String eventName;
        final Date date; // YYYY-MM-DD
        final String eventTime; // HH:MM
        final String eventLocation;
        final String eventDescription;

        public Event(String eventName, Date date, String eventTime, String eventLocation, String eventDescription) {
            this.eventName = eventName;
            this.date = date;
            this.eventTime = eventTime;
            this.eventLocation = eventLocation;
            this.eventDescription = eventDescription;
        }

        @Override
        public String toString() {
            return
                    "Event Name: " + eventName +
                            "Event Date: " + date +
                            "Event Time: " + eventTime +
                            "Event Description: " + eventDescription;
        }
    }

    // Schools in a campus
    final private EnumMap<BabyProjects.College.Storage.Enums.School, School> schoolHashMaphashMap;
    final private ArrayList<Event> events;

    public Campus() {
        events = new ArrayList<>();
        schoolHashMaphashMap = new EnumMap<>(BabyProjects.College.Storage.Enums.School.class);
        for (BabyProjects.College.Storage.Enums.School sc : BabyProjects.College.Storage.Enums.School.values()) {
//            System.out.println("new School: "+sc.toString());
            schoolHashMaphashMap.put(sc, new School());
        }
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    @Override
    public void add(School school) {

    }

    @Override
    public void add(Student student) {
        School school = schoolHashMaphashMap.get(student.getSchool());
        school.add(student);
    }

    @Override
    public void remove(Student student) {

    }

    @Override
    public Student get(String roll) {
        // In form of BL.SC--- and CB.---
        BabyProjects.College.Storage.Enums.School sc = BabyProjects.College.Storage.Enums.School.valueOf(roll.substring(0, 1));
        return schoolHashMaphashMap.get(sc).get(roll.substring(3));
    }
}