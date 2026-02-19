package DataServicesClases.ex04;

public class Shipment {
    private String trackingId;
    private String destinationCountry;
    private double weight;
    private boolean isFragile;

    public Shipment(String trackingId, String destinationCountry, double weight, boolean isFragile) {
        this.trackingId = trackingId;
        this.destinationCountry = destinationCountry;
        this.weight = weight;
        this.isFragile = isFragile;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public void setFragile(boolean fragile) {
        isFragile = fragile;
    }

}
