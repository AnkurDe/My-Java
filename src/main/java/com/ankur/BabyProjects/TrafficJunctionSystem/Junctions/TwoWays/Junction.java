package com.ankur.BabyProjects.TrafficJunctionSystem.Junctions.TwoWays;

import com.ankur.BabyProjects.TrafficJunctionSystem.OffShoots.OffShoot2Way;

public class Junction {
    private final String junctionCode;
    // LatLong latLong;
    OffShoot2Way[] offShoot;

    public  Junction(String junctionCode) {
        this.junctionCode = junctionCode;
    }

    public static class Junction3 extends Junction {

        public Junction3(String junctionCode, OffShoot2Way offShoot1, OffShoot2Way offShoot2, OffShoot2Way offShoot3) {
            super(junctionCode);
            offShoot1.setLeft(offShoot2);
            offShoot2.setLeft(offShoot3);
            offShoot3.setLeft(offShoot1);

            offShoot = new OffShoot2Way[] {offShoot1, offShoot2, offShoot3};
        }
    }

    public static class RoundAbout5 extends Junction {

        public RoundAbout5(String junctionCode, OffShoot2Way offShoot1, OffShoot2Way offShoot2, OffShoot2Way offShoot3, OffShoot2Way offShoot4, OffShoot2Way offShoot5) {
            super(junctionCode);
            offShoot1.setLeft(offShoot2);
            offShoot2.setLeft(offShoot3);
            offShoot3.setLeft(offShoot4);
            offShoot4.setLeft(offShoot5);
            offShoot5.setLeft(offShoot1);

            offShoot = new OffShoot2Way[] {offShoot1, offShoot2, offShoot3, offShoot4, offShoot5};
        }
    }

    public static class RoundAbout6 extends Junction {

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
}
