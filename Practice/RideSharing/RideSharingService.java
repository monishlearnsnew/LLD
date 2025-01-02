package Practice.RideSharing;

import java.util.ArrayList;
import java.util.List;

public class RideSharingService {
    private List<Passenger> passengers;
    private List<Driver> availableDrivers;

    public RideSharingService(){
        this.passengers = new ArrayList<>();
        this.availableDrivers = new ArrayList<>();
    }

    public void addDriver(Driver driver){
        availableDrivers.add(driver);
    }

    public void removeDriver(Driver driver){
        availableDrivers.remove(driver);
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger){
        passengers.remove(passenger);
    }

    public void bookRide(Passenger passenger, int distance, FareStrategy strategy){
        if(availableDrivers.size() == 0){
            System.out.println("No driver available");
        }
        GetNearestDriver nearestDistance = new GetNearestDriver(new EuclideanDistance());
        Driver nearestDriver = nearestDistance.findNearestDriver(availableDrivers, passenger);

        availableDrivers.remove(nearestDriver);

        Ride ride = new Ride(passenger, nearestDriver, distance, strategy);
        ride.calculateFare();

        ride.updateStatus(RideStatus.ONGOING);

        ride.updateStatus(RideStatus.ENDED);

        passenger.notify("The total amount of the ride is "+ ride.getFare());
    }




}
