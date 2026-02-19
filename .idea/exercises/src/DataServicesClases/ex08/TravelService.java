package DataServicesClases.ex08;

import java.util.ArrayList;
import java.util.List;

public class TravelService {

    public double calculateCO2(Traveler traveler) {
        double CO2 = 0.0;
        double actualCO2 = 0.0;
        boolean hasTrainTrip = false;

        if (traveler != null && traveler.getTravelHistory() != null) {

            for (Trip trip : traveler.getTravelHistory()) {
                actualCO2 = 0.0;
                if (trip.getVehicle().equals("Plane")) {
                    actualCO2 += trip.distance * 0.25;
                }
                if (trip.getVehicle().equals("Bus")) {
                    actualCO2 += trip.distance * 0.10;
                }
                if (trip.getVehicle().equals("Train")) {
                    actualCO2 += trip.distance * 0.05;
                    hasTrainTrip = true;
                }
                if (trip.hasPaidCO2) {
                    actualCO2 = actualCO2 / 2;
                }
                CO2 += actualCO2;
            }
        }
        return CO2;
    }


    public List<String> isEliteGreen(Agency agency) {
        List<String> EliteGreenTravelers = new ArrayList<>();

        if (agency != null && agency.travelers != null) {


            for (Traveler traveler : agency.travelers) {
                double totalCO2 = 0.0;
                boolean hasTraveledOnTrain = false;
                totalCO2 += calculateCO2(traveler);
                for (Trip trip : traveler.getTravelHistory()) {
                    if (trip.getVehicle().equals("Train")) {
                        hasTraveledOnTrain = true;
                    }
                }
                if (totalCO2 < 600 && hasTraveledOnTrain) {
                    EliteGreenTravelers.add(traveler.getName());
                }
            }
        }
        return EliteGreenTravelers;
    }

}
