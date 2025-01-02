package BehaviouralPatterns.OBSERVER;

public class MobileDevice implements Observer{

    private String name;

    @Override
    public void update(float temp) {
        System.out.println("The Temperature now for the "+name+ "is "+ temp);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
}
