package BabyProjects.TrafficJunctionSystem.OffShoots;

public class OffShoot1WayIncoming extends OffShoot {
    int noOfVehicles;

    public OffShoot1WayIncoming(String code, Direction direction, OffShoot left, Signal signalState, int noOfVehicles) {
        super(code, direction);
        this.noOfVehicles = noOfVehicles;
    }
}
