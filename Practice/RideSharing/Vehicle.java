package Practice.RideSharing;

public class Vehicle {
    private String vehicleId;
    private String vehicleNo;

    public Vehicle(String vehicleId,String VehicleNo){
        this.vehicleNo = VehicleNo;
        this.vehicleId = vehicleId;
    }

    public int getFare() {
        return 5;
    }
}
