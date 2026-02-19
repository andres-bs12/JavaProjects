package DataServicesClases.ex08;

import java.util.List;

public class Agency {
    List<Traveler> travelers;

    public Agency(List<Traveler> travelers) {
        this.travelers = travelers;
    }

    public Agency() {
    }

    public List<Traveler> getTravelers() {
        return travelers;
    }

    public void setTravelers(List<Traveler> travelers) {
        this.travelers = travelers;
    }
}
