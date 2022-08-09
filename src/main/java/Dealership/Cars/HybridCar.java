package Dealership.Cars;

import Dealership.Cars.CarParts.EngineType;
import Dealership.Cars.CarParts.TyreType;

public class HybridCar extends Car{
    public HybridCar(EngineType engine, TyreType tyre, String model, double price, String color, double damage) {
        super(engine, tyre, model, price, color, damage);
    }
}
