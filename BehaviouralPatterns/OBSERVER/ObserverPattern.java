package BehaviouralPatterns.OBSERVER;

public class ObserverPattern {
    public static void main(String[] args){
        // create observer
        MobileDevice mobileDevice = new MobileDevice();
        mobileDevice.setName("Redmi");

        MobileDevice mobileDevice1 = new MobileDevice();
        mobileDevice1.setName("Samsung");


        WeatherStation weatherStation = new WeatherStation();
        weatherStation.setTemperature(0);

        weatherStation.addSubscriber(mobileDevice1);
        weatherStation.addSubscriber(mobileDevice);

        weatherStation.setTemperature(25);

        weatherStation.addSubscriber(mobileDevice1);
        weatherStation.setTemperature(30);

    }
}
