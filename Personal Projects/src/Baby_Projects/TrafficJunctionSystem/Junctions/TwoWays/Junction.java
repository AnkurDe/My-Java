package Baby_Projects.TrafficJunctionSystem.Junctions.TwoWays;

import Baby_Projects.TrafficJunctionSystem.OffShoots.OffShoot2Way;

public class Junction {
    private final String junctionCode;
    // LatLong latLong;
    OffShoot2Way[] offShoot;

    public  Junction(String junctionCode) {
        this.junctionCode = junctionCode;
    }
}
