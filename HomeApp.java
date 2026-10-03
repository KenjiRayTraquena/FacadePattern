public class HomeApp{

    public static void main(String[] args){
        HomeInterface home = new HomeInterface();

        System.out.println();
        System.out.println("Turning On all home services:");
        home.turnOnAll();
        System.out.println();

        System.out.println("Turning Off all home services:");
        home.turnOffAll();
        System.out.println();
    }


}