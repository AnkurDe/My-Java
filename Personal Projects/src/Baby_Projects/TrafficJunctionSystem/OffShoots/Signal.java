package Baby_Projects.TrafficJunctionSystem.OffShoots;

public class Signal {
    public final static byte RED = 0;
    public final static byte YELLOW = 1;
    public final static byte GREEN = 2;

    private byte left, straight, right;


    public byte getLeft() {
        return left;
    }

    public void setLeft(byte left) {
        this.left = left;
    }

    public byte getRight() {
        return right;
    }

    public void setRight(byte right) {
        this.right = right;
    }

    public byte getStraight() {
        return straight;
    }

    public void setStraight(byte straight) {
        this.straight = straight;
    }

    public void setSignal(byte left, byte straight, byte right) {
        setLeft(left);
        setStraight(straight);
        setRight(right);
    }

    public void setYellow() {
        setLeft(YELLOW);
        setStraight(YELLOW);
        setRight(YELLOW);
    }

    /**
     * Sets default values to all red signals
     */
    public Signal() {
        setLeft(RED);
        setStraight(RED);
        setRight(RED);
    }
}
