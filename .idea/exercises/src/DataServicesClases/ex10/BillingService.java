package DataServicesClases.ex10;

import java.util.Collections;
import java.util.List;

public class BillingService {


    public double calculateRawConsumptionCost(HouseHold hh) {
        return hh.getRawConsumption() * 0.20;
    }

    // Funtion
    public double calculateAdjustedUsage(HouseHold hh) {
        if (hh == null) {
            return 0;
        } else {
            double adjustedUsage = calculateRawConsumptionCost(hh);

            adjustedUsage += adjustedUsage * 0.05; // adding fee 5%

            // Adding carbon tax
            if (hh.getRawConsumption() > 500) {
                adjustedUsage += 15.0;
            }
            return adjustedUsage;

        }
    }

}
