package Practice.RideSharing;

public class LuxuryCar extends Car {
    public LuxuryCar(String vehicleId,String vehicleNo){
        super(vehicleId,vehicleNo);
    }

    public int getFare(){
        return 60;
    }
}
