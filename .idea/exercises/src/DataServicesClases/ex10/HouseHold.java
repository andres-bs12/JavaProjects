package DataServicesClases.ex10;

public class HouseHold {
    private int id;
    private double rawConsumption;

    public HouseHold(int id, double rawConsumption) {
        this.id = id;
        this.rawConsumption = rawConsumption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRawConsumption() {
        return rawConsumption;
    }

    public void setRawConsumption(double rawConsumption) {
        this.rawConsumption = rawConsumption;
    }
}
