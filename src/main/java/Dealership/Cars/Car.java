package Dealership.Cars;

import Dealership.Cars.CarParts.EngineType;
import Dealership.Cars.CarParts.TyreType;

public abstract class Car {
    EngineType engine;
    TyreType tyre;
    private String model;
    private double price;
    private String color;
    private double damage;

    public Car(EngineType engine, TyreType tyre, String model, double price, String color, double damage) {
        this.engine = engine;
        this.tyre = tyre;
        this.model = model;
        this.price = price;
        this.color = color;
        this.damage = damage;
    }

    public String getEngineType(){
        return this.engine.getEngineType();
    }

    public String getTyreType(){
        return this.tyre.getTyreType();
    }

    public String getModel(){
        return this.model;
    }

    public double getPrice(){
        this.price -= this.damage;
        return this.price;
    }

    public String getColor(){
        return this.color;
    }

    public double getDamage(){
        return this.damage;
    }

    public void addDamage(double value){
        this.damage += value;
    }

    public void removeDamage(){
        this.damage = 0;
    }
}
