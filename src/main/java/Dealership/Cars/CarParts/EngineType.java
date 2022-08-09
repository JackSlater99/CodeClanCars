package Dealership.Cars.CarParts;

public enum EngineType {
    PETROL("Petrol"),
    HYBRID("Hybrid"),
    ELECTRIC("Electric");

    private final String engineType;

    EngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }
}
