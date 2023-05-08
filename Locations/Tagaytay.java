package Locations;
import Tourist.Tourist;

public class Tagaytay implements Locations {
    
    int airFare = 70;

    public int getAirfare(){
        return airFare;
    }

    @Override
    public void accept (Tourist tourist) {
        tourist.visit(this);
    }
    
}
