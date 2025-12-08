package BabyProjects.TrafficJunctionSystem.Junctions.TwoWays;

import BabyProjects.TrafficJunctionSystem.OffShoots.OffShoot2Way;

public class Junction3 extends Junction {

    public Junction3(String junctionCode, OffShoot2Way offShoot1, OffShoot2Way offShoot2, OffShoot2Way offShoot3) {
        super(junctionCode);
        offShoot1.setLeft(offShoot2);
        offShoot2.setLeft(offShoot3);
        offShoot3.setLeft(offShoot1);

        offShoot = new OffShoot2Way[] {offShoot1, offShoot2, offShoot3};
    }
}
