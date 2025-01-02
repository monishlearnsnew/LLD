package Practice.RideSharing;

public class Passenger extends User {
    String passengerId;
    Location location;
    
    public Passenger(String name, String id){
        super(name);
        this.passengerId = id;
    }

    public String getPassengerId(){
        return passengerId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location){
        this.location = location;
    }

    public void notify(String message){
        // any action on message
        System.out.println(message);
    }

}