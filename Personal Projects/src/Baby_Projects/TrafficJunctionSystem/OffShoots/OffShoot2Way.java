package Baby_Projects.TrafficJunctionSystem.OffShoots;

public class OffShoot2Way extends OffShoot {
    public int noOfLeftVehicles, noOfRightVehicles, noOfStraightVehicles;


    public OffShoot2Way(String code, Direction direction) {
        super(code, direction);
    }

    public void addLeftVehicle (){
        ++noOfLeftVehicles;
    }

    public void addRightVehicle (){
        ++noOfRightVehicles;
    }

    public void addStraightVehicle (){
        ++noOfStraightVehicles;
    }

    public void removeLeftVehicle (){
        --noOfLeftVehicles;
    }

    public void removeRightVehicle (){
        --noOfRightVehicles;
    }

    public void removeStraightVehicle (){
        --noOfStraightVehicles;
    }

    @Override
    public OffShoot getLeft() {
        return super.getLeft();
    }
}
