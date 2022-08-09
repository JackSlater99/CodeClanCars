package Dealership;

import Dealership.Cars.Car;
import Dealership.Cars.ElectricCar;

import java.util.ArrayList;

public class Dealership {
    private double till;
    private ArrayList<Car>carStock;

    public Dealership(double till) {
        this.till = till;
        this.carStock = new ArrayList<>();
    }

    public double getTill() {
        return this.till;
    }

    public int getCarsInStock() {
        return carStock.size();
    }

    public void addCar(Car car) {
        carStock.add(car);
    }

    public void removeCar(Car car) {
        carStock.remove(car);
    }

    public void addMoney(double price) {
        till += price;
    }

    public void removeMoney(double price) {
        till -= price;
    }

    public void sellCar(Car car) {
        till += car.getPrice();
        carStock.remove(car);
    }

    public void buyCar(Car car) {
        till -= car.getPrice();
        carStock.add(car);
    }

    public void repair(Car car) {
        this.till -= car.getDamage();
    }
}
