public class Light implements HomeService{
    
    @Override
    public void turOn(){
        System.out.println("Lights are On!");
    }

    @Override 
    public void turnOff(){
        System.out.println("Ligts are Off...");
    }

}