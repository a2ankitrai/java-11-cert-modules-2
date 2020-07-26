package zoo.visitor;

import java.util.*;
import zoo.tours.api.*;
import zoo.tours.reservations.*;

/** Our module definition doesn't need to know anything about the implementations
since the zoo.tours.reservations module is handling the lookup.
**/
public class Tourist {

  public static void main(String args[]){

    Tour tour = TourFinder.findSingleTour();
    System.out.println("Single Tour: "+ tour);

    List<Tour> toursList = TourFinder.findAllTours();
    System.out.println("# tours: "+ toursList.size());

  }
}
