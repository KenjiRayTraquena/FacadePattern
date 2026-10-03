public class TV implements HomeService{

    @Override 
    public void turOn(){
        System.out.println("Tv is On!");
    }

    @Override 
    public void turnOff(){
        System.out.println("TV is Off...");
    }

}