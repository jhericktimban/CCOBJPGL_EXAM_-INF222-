package Locations;

import Tourist.Tourist;

public class Palawan implements Locations {

    int airFare = 550;

    public int getAirfare() {
        return airFare;
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

}
