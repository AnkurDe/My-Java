package Baby_Projects.TrafficJunctionSystem;

import Baby_Projects.TrafficJunctionSystem.Junctions.TwoWays.Junction4;
import Baby_Projects.TrafficJunctionSystem.OffShoots.Direction;
import Baby_Projects.TrafficJunctionSystem.OffShoots.OffShoot2Way;

public class TJS {
    public static void model() {
        Junction4 j4;
        j4 = new Junction4("Silk Board Underpass jn.",
                new OffShoot2Way("ORR-W", new Direction(90.0)),
                new OffShoot2Way("Hosur-N", new Direction(180.0)),
                new OffShoot2Way("ORR-E", new Direction(270.0)),
                new OffShoot2Way("Hosur-S", new Direction(0.0))
                );

    }

    public static void main(String[] args) {
        model();
    }
}
