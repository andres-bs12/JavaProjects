package DataServicesClases.ex04;

public class LogisticsService {
    public String determineTier(Shipment shipment) {

        if (shipment.getDestinationCountry().equals("Austria")) {
            if (shipment.getWeight() > 30) {
                return "Heavy-Domestic";
            }
        } else {
            if (shipment.isFragile()) {
                return "Premium-International";
            }
            if (shipment.getWeight() <= 10) {
                return "Standard-Global";
            }
        }
        return "General-Cargo";
    }
}
