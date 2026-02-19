package DataServicesClases.ex08;

import java.util.List;

public class Traveler {
    String name;
    List<Trip> travelHistory;

    public Traveler(String name, List<Trip> travelHistory) {
        this.name = name;
        this.travelHistory = travelHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Trip> getTravelHistory() {
        return travelHistory;
    }

    public void setTravelHistory(List<Trip> travelHistory) {
        this.travelHistory = travelHistory;
    }
}
