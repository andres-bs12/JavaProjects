package DataServicesClases.ex08;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Trip trip1 = new Trip(400, "Train", true);
        Trip trip2 = new Trip(600, "Train", true);
        Trip trip21 = new Trip(1000, "Plane", true);
        Trip trip3 = new Trip(60, "Plane", false);
        Trip trip4 = new Trip(100, "Bus", false);
        List<Trip> trips1 = new ArrayList<>(List.of(trip1, trip2, trip21));
        List<Trip> trips2 = new ArrayList<>(List.of(trip3, trip4));


        Traveler traveler1 = new Traveler("Andres", trips1);
        Traveler traveler2 = new Traveler("Juan", trips2);

        Agency agc1 = new Agency();
        agc1.setTravelers(List.of(traveler1, traveler2));

        TravelService service = new TravelService();

        System.out.println(service.isEliteGreen(agc1));

    }


}
