public class AirConditioning implements HomeService{

    @Override 
    public void turOn(){
        System.out.println("Air Conditioning is On!");
    }

    @Override 
    public void turnOff(){
        System.out.println("Air Conditioning is Off...");
    }
}