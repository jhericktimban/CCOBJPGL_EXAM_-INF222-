package Locations;
import Tourist.Tourist;

public class Boracay implements Locations {

    int airFare = 100;
    
    public int getAirfare(){
        return airFare;
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

    

}