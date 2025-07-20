package Baby_Projects.TrafficJunctionSystem.Junctions.TwoWays;

import Baby_Projects.TrafficJunctionSystem.OffShoots.OffShoot2Way;
import Baby_Projects.TrafficJunctionSystem.OffShoots.Signal;

import static Baby_Projects.TrafficJunctionSystem.OffShoots.Signal.GREEN;
import static Baby_Projects.TrafficJunctionSystem.OffShoots.Signal.RED;

public class Junction4 extends Junction {
    OffShoot2Way offShoot1, offShoot2, offShoot3, offShoot4;

    public Junction4(String junctionCode,
                     OffShoot2Way offShoot1,
                     OffShoot2Way offShoot2,
                     OffShoot2Way offShoot3,
                     OffShoot2Way offShoot4) {

        super(junctionCode);
        offShoot1.setLeft(offShoot2);
        offShoot2.setLeft(offShoot3);
        offShoot3.setLeft(offShoot4);
        offShoot4.setLeft(offShoot1);

        this.offShoot1 = offShoot1;
        this.offShoot2 = offShoot2;
        this.offShoot3 = offShoot3;
        this.offShoot4 = offShoot4;

        offShoot = new OffShoot2Way[] {offShoot1, offShoot2, offShoot3, offShoot4};
    }

    public void signalLogic (OffShoot2Way o2w, Signal signal) {
        byte left = signal.getLeft();
        byte straight = signal.getStraight();
        byte right = signal.getRight();

        // Insert code for 5 secs gap where the signal turns yellow
        // setYellowSignal();


        if (left == GREEN && straight == GREEN && right == GREEN) {
            // For left
            OffShoot2Way temp = (OffShoot2Way) o2w.getLeft();
            temp.setSignalState(GREEN, RED, RED);

            // For left.left
            temp = (OffShoot2Way) temp.getLeft();
            temp.setSignalState(GREEN, RED, RED);

            // For left.left.left
            temp = (OffShoot2Way) temp.getLeft();
            temp.setSignalState(GREEN, RED, RED);
        }

        else if (left ==GREEN && straight == RED && right == GREEN) {
            // For left
            OffShoot2Way temp = (OffShoot2Way) o2w.getLeft();
            temp.setSignalState(GREEN, GREEN, RED);

            // For left.left
            temp = (OffShoot2Way) temp.getLeft();
            temp.setSignalState(GREEN, RED, RED);

            // For left.left.left
            temp = (OffShoot2Way) temp.getLeft();
            temp.setSignalState(GREEN, RED, RED);
        }

        else if (left == RED && straight == GREEN && right == GREEN) {
            // For left
            OffShoot2Way temp = (OffShoot2Way) o2w.getLeft();
            temp.setSignalState(GREEN, GREEN, RED);

            // For left.left
            temp = (OffShoot2Way) temp.getLeft();
            temp.setSignalState(GREEN, RED, RED);

            // For left.left.left
            temp = (OffShoot2Way) temp.getLeft();
            temp.setSignalState(GREEN, RED, RED);
        }

        else if (left==GREEN && straight ==GREEN && right == RED) {
            // For left
            OffShoot2Way temp = (OffShoot2Way) o2w.getLeft();
            temp.setSignalState(GREEN, RED, RED);

            // For left.left
            temp = (OffShoot2Way) temp.getLeft();
            temp.setSignalState(GREEN, RED, RED);

            // For left.left.left
            temp = (OffShoot2Way) temp.getLeft();
            temp.setSignalState(GREEN, RED, GREEN);
        }

        else if (left==RED && straight ==GREEN && right == RED) {
            // For left
            OffShoot2Way temp = (OffShoot2Way) o2w.getLeft();
            temp.setSignalState(GREEN, RED, RED);

            // For left.left
            temp = (OffShoot2Way) temp.getLeft();
            temp.setSignalState(GREEN, GREEN, RED);

            // For left.left.left
            temp = (OffShoot2Way) temp.getLeft();
            temp.setSignalState(GREEN, RED, RED);
        }
    }

    // Sets entire to yellow signal
    public void setYellowSignal () {
        offShoot1.setYellowSignal();
        offShoot2.setYellowSignal();
        offShoot3.setYellowSignal();
        offShoot4.setYellowSignal();
    }

    // Sets entire to red signal
    public void setRedSignal () {
        offShoot1.setRedSignal();
        offShoot2.setRedSignal();
        offShoot3.setRedSignal();
        offShoot4.setRedSignal();
    }

    public void setSignal (int offShootNumber, Signal signal) {
        switch (offShootNumber) {
            case 1:
                signalLogic(offShoot1, signal);
                break;

            case 2:
                signalLogic(offShoot2, signal);
                break;

            case 3:
                signalLogic(offShoot3, signal);
                break;

            case 4:
                signalLogic(offShoot4, signal);
                break;

            default:
                throw new IllegalArgumentException("Incorrect offShoot number");
        }
    }

}
