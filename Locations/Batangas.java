package Locations;

import Tourist.Tourist;

public class Batangas implements Locations {

    int airFare = 300;

    public int getAirfare() {
        return airFare;
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

}
