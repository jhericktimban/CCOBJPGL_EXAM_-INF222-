package Locations;
import Tourist.Tourist;

public class LaUnion implements Locations {

    int airFare = 230;

    public int getAirfare(){
        return airFare;
    }

    @Override
    public void accept(Tourist tourist){
        tourist.visit(this);
    }
    
}
