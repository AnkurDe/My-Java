package BabyProjects.TrafficJunctionSystem.Junctions.TwoWays;

import BabyProjects.TrafficJunctionSystem.OffShoots.OffShoot2Way;

public class RoundAbout6 extends Junction {

    public RoundAbout6(String junctionCode, OffShoot2Way offShoot1, OffShoot2Way offShoot2, OffShoot2Way offShoot3, OffShoot2Way offShoot4, OffShoot2Way offShoot5, OffShoot2Way offShoot6) {
        super(junctionCode);
        offShoot1.setLeft(offShoot2);
        offShoot2.setLeft(offShoot3);
        offShoot3.setLeft(offShoot4);
        offShoot4.setLeft(offShoot5);
        offShoot5.setLeft(offShoot6);
        offShoot6.setLeft(offShoot1);

        offShoot = new OffShoot2Way[] {offShoot1, offShoot2, offShoot3, offShoot4, offShoot5, offShoot6};
    }
}
