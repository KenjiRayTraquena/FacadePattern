public class HomeInterface{
    private Light light;
    private TV tv;
    private AirConditioning airConditioning;

    public HomeInterface(){
        light = new Light();
        tv = new TV();
        airConditioning = new AirConditioning();
    }

    public void turnOnAll(){
        light.turOn();
        tv.turOn();
        airConditioning.turOn();
    }

    public void turnOffAll(){
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}