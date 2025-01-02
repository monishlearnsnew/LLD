package Practice.RideSharing;

import java.util.List;

public class GetNearestDriver {
    private NearestDistance nearestDistance;

    public GetNearestDriver(NearestDistance nearestDistance){
        this.nearestDistance = nearestDistance;
    }

    public Driver findNearestDriver(List<Driver> availableDrivers, Passenger passenger){
        Driver choosenDriver = availableDrivers.get(0);
        int choosenDriverDistance = nearestDistance.calculateNearestDistance(passenger.getLocation(), availableDrivers.get(0).getLocation());
        for(Driver driver: availableDrivers){
            int currentDriverDistance = nearestDistance.calculateNearestDistance(passenger.getLocation(), driver.getLocation());
            if(currentDriverDistance < choosenDriverDistance){
                choosenDriverDistance = currentDriverDistance;
                choosenDriver = driver;
            }
        }
        return choosenDriver;
    }
}
