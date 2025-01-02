package Practice.RideSharing;

public class Car extends Vehicle {
    public Car(String vehicleId,String vehicleNo){
        super(vehicleId,vehicleNo);
    }

    public int getFare(){
        return 40;
    }
}
