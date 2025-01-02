package Practice.RideSharing;

public class Bike extends Vehicle {
    
    public Bike(String vehicleId,String vehicleNo){
        super(vehicleId,vehicleNo);
    }

    public int getFare(){
        return 20;
    }
}
