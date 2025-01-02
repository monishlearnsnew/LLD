package BehaviouralPatterns.OBSERVER;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
   private List<Observer> observerList;
   private float temperature;

   WeatherStation(){
    observerList = new ArrayList<>();
   }

   public float getTemperature(){
    return temperature;
   }

   public void setTemperature(float temperature){
        this.temperature = temperature;
        notifySubscribers();
   }

    @Override
    public void addSubscriber(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(Observer obj : observerList){
            obj.update(temperature);
        }
    }

   
}
