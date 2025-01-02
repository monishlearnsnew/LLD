package Practice.RideSharing;

public interface FareStrategy {
    public int calculateFare(int distance, Vehicle vehicle);
}
