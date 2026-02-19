package DataServicesClases.ex08;

public class Trip {
    int distance;
    String vehicle;
    boolean hasPaidCO2;

    public Trip(int distance, String vehicle, boolean hasPaidCO2) {
        this.distance = distance;
        this.vehicle = vehicle;
        this.hasPaidCO2 = hasPaidCO2;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isHasPaidCO2() {
        return hasPaidCO2;
    }

    public void setHasPaidCO2(boolean hasPaidCO2) {
        this.hasPaidCO2 = hasPaidCO2;
    }
}
