package BabyProjects.TrafficJunctionSystem.OffShoots;


import static BabyProjects.TrafficJunctionSystem.OffShoots.Signal.RED;
import static BabyProjects.TrafficJunctionSystem.OffShoots.Signal.YELLOW;

/**
 * This is a class handling Offshoot as in a junction.
 * Offshoot - A way of traffic flow
 * <br>
 * <p>
 *     In the case of two roads intersecting at 90 degrees, we have 4 offshoots. The number of lanes doesn't matter.
 * </p>
 *
 *
 */

public class OffShoot {
    final String code;
    Direction direction;
    private OffShoot left;
    private Signal signalState;

    public void setLeft(OffShoot left) {
        this.left = left;
    }

    public OffShoot getLeft() {
        return left;
    }

    public void setSignalState(byte left, byte straight, byte right) {
        this.signalState.setSignal(left, straight, right);
    }

    public void setYellowSignal() {
        setSignalState(YELLOW, YELLOW, YELLOW);
    }

    public void setRedSignal() {
        setSignalState(RED, RED, RED);
    }

    public OffShoot (String code, Direction direction) {
        this.code = code;
        this.direction = direction;
        this.signalState = new Signal();
    }
}