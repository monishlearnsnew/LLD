package Practice.RideSharing;

public class Ride {
    private Passenger passenger;
    private Driver driver;
    private int distance;
    private FareStrategy fareStrategy;
    private int fare;
    private RideStatus status;

    public Ride(Passenger passenger, Driver driver,int distance,FareStrategy fareStrategy){
        this.passenger = passenger;
        this.driver = driver;
        this .distance = distance;
        this.fareStrategy = fareStrategy;
        this.status = RideStatus.STARTED;
    }

    public int calculateFare(){
        this.fare = fareStrategy.calculateFare(distance,driver.getVehicle());
        return fare;
    }

    public void updateStatus(RideStatus status){
        this.status = status;
        notifyUsers(status);
    }

    public int getFare(){
        return fare;
    }

    public void notifyUsers(RideStatus status){
        passenger.notify("your ride is "+ status);
        driver.notify("ride is "+ status);
    }
    
}
