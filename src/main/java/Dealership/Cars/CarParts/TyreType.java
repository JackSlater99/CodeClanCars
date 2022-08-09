package Dealership.Cars.CarParts;

public enum TyreType {
    SEVENTEENINCH("17 Inch"),
    NINETEENINCH("19 Inch"),
    TWENTYONEINCH("21 Inch");

    private final String tyreType;

    TyreType(String tyreType) {
        this.tyreType = tyreType;
    }

    public String getTyreType() {
        return tyreType;
    }
}
