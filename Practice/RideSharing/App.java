package Practice.RideSharing;

public class App {
    public static void main(String[] args){
        RideSharingService rideSharingService = new RideSharingService();

        // create passengers

        Passenger passenger1 = new Passenger("monish","1");
        Passenger passenger2 = new Passenger("varun","2");

        // create vehicles and drivers

        Bike bike = new Bike("1", "KA4012345");
        Vehicle car = new LuxuryCar("2", "KA401234");

        Driver driver1= new Driver("prathush", "1", new DrivingLicense("VEOSDK123"), car);

        Driver driver2 = new Driver("prathushyini", "2", new DrivingLicense("VEOSDK123545"), bike);


        rideSharingService.addDriver(driver1);
        rideSharingService.addDriver(driver2);

        rideSharingService.addPassenger(passenger1);
        rideSharingService.addPassenger(passenger2);

        passenger1.setLocation(new Location(1, 2));
        passenger2.setLocation(new Location(2, 3));

        driver1.setLocation(new Location(4, 5));
        driver2.setLocation(new Location(6, 7));

        rideSharingService.bookRide(passenger1, 10, new StandardFare());
        rideSharingService.bookRide(passenger2, 5, new LuxuryFare());

    }
}
