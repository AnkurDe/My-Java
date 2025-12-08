package BabyProjects.TrafficJunctionSystem.OffShoots;

public class OffShoot1WayOutgoing extends OffShoot {
    double leftGoing, straightGoing, rightGoing;

    public OffShoot1WayOutgoing(String code, Direction direction, OffShoot left, Signal signalState) {
        super(code, direction);
    }
}
