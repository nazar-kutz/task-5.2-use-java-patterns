package task_3;

import task_3.entity.Bocking;
import task_3.entity.Flight;
import task_3.entity.Tour;
import task_3.entity.Transfer;

/**
 * Created by Nazar on 11.08.2017.
 */
public class Main3 {
    public static void main(String[] args) {
        Tour tour = Tour.getNewTourBuilder().buildTransferFromAirport(new Transfer("airport Vega",
                "hotel Californiya", "17 JUNE 2017 15:40")).buildTransferToAirport
                (new Transfer("hotel Californiya", "airport Vega", "25 JUNE 2017")).
                buildFlight(new Flight("16 JUNE 2017", "25 JUNE 2017")).buildBocking
                (new Bocking("Californiya", "17 JUNE 2017", "25 JUNE 2017"))
                .buildInsurance().build();

        System.out.println(tour);

        System.out.println();
        System.out.println("another tour: ");

        Tour anotherTour = Tour.getNewTourBuilder().buildFlight(new Flight("16 JUNE 2017")).buildBocking
                (new Bocking("Californiya", "17 JUNE 2017", "25 JUNE 2017")).build();

        System.out.println(anotherTour);
    }
}
