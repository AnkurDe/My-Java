package com.ankur.BabyProjects.TrafficJunctionSystem;

import com.ankur.BabyProjects.TrafficJunctionSystem.Junctions.TwoWays.Junction4;
import com.ankur.BabyProjects.TrafficJunctionSystem.OffShoots.Direction;
import com.ankur.BabyProjects.TrafficJunctionSystem.OffShoots.OffShoot2Way;

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
