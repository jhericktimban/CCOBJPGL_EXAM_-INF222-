package Tourist;
import Locations.Batangas;
import Locations.Boracay;
import Locations.LaUnion;
import Locations.Locations;
import Locations.Moon;
import Locations.Palawan;
import Locations.Tagaytay;

public interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Batangas batangas);
    void visit(Palawan palawan);
    void visit(Moon moon);
    void visit(LaUnion launion);
    void visit(Tagaytay tagaytay);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
    

}