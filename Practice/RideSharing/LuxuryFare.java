package Practice.RideSharing;

public class LuxuryFare implements FareStrategy {
    @Override
    public int calculateFare(int distance, Vehicle vehicle) {
        return 2*vehicle.getFare() * distance;
    }
}
