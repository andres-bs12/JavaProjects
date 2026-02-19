package DataServicesClases.ex10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HouseHold h1 = new HouseHold(123, 120);
        HouseHold h2 = new HouseHold(124, 200.0);
        List<HouseHold> hausHolds = new ArrayList<>(List.of(h1, h2));

        BillingService service = new BillingService();

        for (HouseHold hh : hausHolds) {
            System.out.println("\"El hogar con ID " + hh.getId() + " tiene una factura par de: " + Math.ceil(service.calculateAdjustedUsage(hh)) + " €");
        }
    }
}
