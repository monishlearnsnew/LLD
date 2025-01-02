package Practice.RideSharing;

public class StandardFare implements FareStrategy {

    @Override
    public int calculateFare(int distance, Vehicle vehicle) {
        return (int) (0.4*vehicle.getFare() * distance);
    }
    
}
