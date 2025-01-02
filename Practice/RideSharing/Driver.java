package Practice.RideSharing;

public class Driver extends User{
    private String driverId;
    private Vehicle vehicle;
    private DrivingLicense drivingLicense;
    private Location location;
    private DriverStatus status;
    
    public Driver(String name, String id,DrivingLicense drivingLicense,Vehicle vehicle){
        super(name);
        this.driverId = id;
        this.vehicle = vehicle;
        this.drivingLicense = drivingLicense;
    }

    public String getDriverId(){
        return driverId;
    }

    public Location getLocation() {
        return location;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public void setLocation(Location location){
        this.location = location;
    }

    public void setState(DriverStatus status){
        this.status = status;
    }

    public void notify(String message){
        // any action on message
        System.out.println(message);
    }
}
