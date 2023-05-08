package Tourist;

import Locations.Batangas;
import Locations.Boracay;
import Locations.LaUnion;
import Locations.Moon;
import Locations.Palawan;
import Locations.Tagaytay;

public class Me implements Tourist {

    static int budget = 1000;

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    @Override
    public void visit(Boracay boracay) {    

        // Define your visit
        if (Me.budget >= boracay.getAirfare()) {
            System.out.println("Welcome to Boracay!");
            budget -= boracay.getAirfare();
        } else {
            System.out.println("You don't have enough budget. kawawa ka naman </3");
        }

        checkBudget();
        System.out.println("____________________________________________________________");

    }

    public void visit(Batangas batangas) {

        // Define your visit
        if (Me.budget >= batangas.getAirfare()) {
            System.out.println("Welcome to Batangas! Ala eh!");
            budget -= batangas.getAirfare();
        } else {
            System.out.println("You don't have enough budget. kawawa ka naman </3");
        }

        checkBudget();
        System.out.println("____________________________________________________________");

    }

    public void visit(Palawan palawan) {

        // Define your visit
        if (Me.budget >= palawan.getAirfare()) {
            System.out.println("Welcome to Palawan! Cuz' why not?");
            budget -= palawan.getAirfare();
        } else {
            System.out.println("You don't have enough budget. kawawa ka naman </3");        
        }

        checkBudget();
        System.out.println("____________________________________________________________");

    }

    public void visit(Moon moon) {

        // Define your visit
        if (Me.budget >= moon.getAirfare()) {
            System.out.println("San ka punta? To the moon. Roadtrip broom! broom! skkrtt skrrt zoom! zoom! sa fake no room!.");
                    budget -= moon.getAirfare();
        } else {
            System.out.println("You don't have enough budget. kawawa ka naman </3");  
        }

        checkBudget();
        System.out.println("____________________________________________________________");

    }

    public void visit(LaUnion launion) {

        // Define your visit
        if (Me.budget >= launion.getAirfare()) {
            System.out.println("Welcome to ELYU UWU!");
            budget -= launion.getAirfare();
        } else {
            System.out.println("You don't have enough budget. kawawa ka naman </3");
        }

        checkBudget();
        System.out.println("____________________________________________________________");

    }

    public void visit(Tagaytay tagaytay) {

        // Define your visit
        if (Me.budget >= tagaytay.getAirfare()) {
            System.out.println("Welcome to Tagaytay! TARA TAGAY!");
            budget -= tagaytay.getAirfare();
        } else {
            System.out.println("You don't have enough budget. kawawa ka naman </3");
        }

        checkBudget();
        System.out.println("____________________________________________________________");

    }

}
