package BabyProjects.TrafficJunctionSystem.Junctions.TwoWays;

import BabyProjects.TrafficJunctionSystem.OffShoots.OffShoot2Way;

public class Junction {
    private final String junctionCode;
    // LatLong latLong;
    OffShoot2Way[] offShoot;

    public  Junction(String junctionCode) {
        this.junctionCode = junctionCode;
    }
}
