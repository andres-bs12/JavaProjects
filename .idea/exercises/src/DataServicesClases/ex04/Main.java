package DataServicesClases.ex04;

public class Main {
    public static void main(String[] args) {

        Shipment ship1 = new Shipment("AT-99", "Austria", 35.0,false);
        Shipment ship2 = new Shipment("US-01",  "USA", 5.0, true);

        LogisticsService serviceLogistic = new LogisticsService();

        System.out.println(serviceLogistic.determineTier(ship1));
        System.out.println(serviceLogistic.determineTier(ship2));
    }
}
