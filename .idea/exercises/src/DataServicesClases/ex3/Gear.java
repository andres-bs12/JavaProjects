package DataServicesClases.ex3;

public class Gear {
    private String mauseBrand;
    private String keyBoardBrand;
    private boolean isWireless;

    public Gear(String mauseBrand, String keyBoardBrand, Boolean isWireless) {
        this.mauseBrand = mauseBrand;
        this.keyBoardBrand = keyBoardBrand;
        this.isWireless = isWireless;
    }

    public Gear() {
    }

    public String getMauseBrand() {
        return mauseBrand;
    }

    public void setMauseBrand(String mauseBrand) {
        this.mauseBrand = mauseBrand;
    }

    public String getKeyBoardBrand() {
        return keyBoardBrand;
    }

    public void setKeyBoardBrand(String keyBoardBrand) {
        this.keyBoardBrand = keyBoardBrand;
    }

    public boolean getWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }
}
