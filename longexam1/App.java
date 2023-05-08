import Locations.Batangas;
import Locations.Boracay;
import Locations.LaUnion;
import Locations.Moon;
import Locations.Palawan;
import Locations.Tagaytay;
import Tourist.Me;
import Tourist.Tourist;

public class App {
    public static void main(String[] args) throws Exception {

        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

        
        Boracay boracay = new Boracay();
        Batangas batangas = new Batangas();
        LaUnion launion = new LaUnion();
        Moon moon = new Moon();
        Palawan palawan = new Palawan();
        Tagaytay tagaytay = new Tagaytay();

        Tourist tour = new Me();

        boracay.accept(tour);
        batangas.accept(tour);
        launion.accept(tour);
        moon.accept(tour);
        palawan.accept(tour);
        tagaytay.accept(tour);



    }
}
